/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.StudentDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Student;
import view.StudentView;

/**
 *
 * @author TP
 */
public class StudentController {
    private StudentView view;
    private DefaultTableModel tableModel;
    private StudentDao studentDao;
    private ArrayList<Student> students;
    private String previousId;
    public StudentController() {
        view = new StudentView();
        tableModel = new DefaultTableModel();
        studentDao = new StudentDao();
        students = new ArrayList<>();
        addColumn();
        view.getTableStudent().setModel(tableModel);
    }
    public void show() throws SQLException {
        view.setVisible(true);
        addEvent();
    }
    private void addColumn() {
        tableModel.addColumn("MSV");
        tableModel.addColumn("Tên sinh viên");
        tableModel.addColumn("Lớp");
        tableModel.addColumn("GPA");
    }
    private void renderTable() throws SQLException{
        students = studentDao.getAll();
        tableModel.setRowCount(0);
        for (Student x : students) {
            tableModel.addRow(x.toRowTable());
        }
    }
    private void addEvent() throws SQLException{
        addClickTableEvent();
        showButtonEvent();
        addButtonEvent();
        addUpdateEvent();
        addResetEvent();
        addDeleteEvent();
    }

    private void addClickTableEvent() {
        view.getTableStudent().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = view.getTableStudent().getSelectedRow();
                if (selectedRow != -1) {
                    String id = (String)view.getTableStudent().getValueAt(selectedRow, 0);
                    String name = (String)view.getTableStudent().getValueAt(selectedRow, 1);
                    String className = (String)view.getTableStudent().getValueAt(selectedRow, 2);
                    double gpa = (double)view.getTableStudent().getValueAt(selectedRow, 3);
                    String gpaString = String.valueOf(gpa);
                    setTxtField(id, name, className, gpaString);
                    previousId = id;
                }
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
            
        });
    }

    private void showButtonEvent()  {
        view.getShowButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    renderTable();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }

    private void addButtonEvent() {
        view.getAddButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = view.getIdTxt().getText();
                String name = view.getNameTxt().getText();
                String className = view.getClassNameTxt().getText();
                String gpaString = view.getGpaTxt().getText();
                if (checkInput(id, name, className, gpaString)) {
                    try {
                        double gpa = Double.parseDouble(gpaString);
                        if (isExistStudent(id)) {
                            JOptionPane.showMessageDialog(view, "Mã sinh viên đã tồn tại!");
                        } else {
                            Student student = new Student(id, name, className, gpa);
                            try {
                                studentDao.add(student);
                                renderTable();
                            } catch (SQLException exception) {
                            }
                        }
                    } catch (NumberFormatException exception) {
                        JOptionPane.showMessageDialog(view, "GPA phải là 1 số thực!");
                    }
                    
                    

                } else {
                    JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
                }
                setTxtField("", "", "", "");
            }
            
        });
    }

    private void addUpdateEvent() {
        view.getUpdateButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = view.getIdTxt().getText();
                String name = view.getNameTxt().getText();
                String className = view.getClassNameTxt().getText();
                String gpaString = view.getGpaTxt().getText();
                if (checkInput(id, name, className, gpaString)) {
                    
                    double gpa = Double.parseDouble(gpaString);
                    if (!previousId.equals(id) && isExistStudent(id)) {
                        JOptionPane.showMessageDialog(view, "Mã sinh viên đã tồn tại!");
                    } else {
                        Student student = new Student(id, name, className, gpa);
                        try {
                            studentDao.update(previousId, student);
                            renderTable();

                        } catch (SQLException exception) {
                        }
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(view, "Vui lòng nhập đầy đủ thông tin!");
                }
                setTxtField("", "", "", "");
            }
            
        });
    }

    private void addResetEvent() {
        view.getResetButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    studentDao.deleteAll();
                    renderTable();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
        });
    }

    private void addDeleteEvent() {
        view.getDeleteButton().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedRow = view.getTableStudent().getSelectedRow();
                String id = (String)view.getTableStudent().getValueAt(selectedRow, 0);
                try {
                    studentDao.delete(id);
                    renderTable();
                    setTxtField("", "", "", "");
                } catch (SQLException exception) {
                }
            }
            
        });
    }
    private void setTxtField(String id, String name, String className, String gpaString) {
        view.getIdTxt().setText(id);
        view.getNameTxt().setText(name);
        view.getClassNameTxt().setText(className);
        view.getGpaTxt().setText(gpaString);
    }
    private boolean checkInput(String id, String name, String className, String gpaString) {
        return !(id.isEmpty() || name.isEmpty() || className.isEmpty() || gpaString.isEmpty());
    }
    private boolean isExistStudent(String id) {
        try {
            if(studentDao.checkExists(id)) {
                return true;
            }
        } catch (SQLException ex) {

        }
        return false;
    }
}
