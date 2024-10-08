package j07010_danh_sach_sinh_vien_trong_file_2;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SinhVien {
    private String id, ten, lop;
    private double gpa;
    private Date nsinh;
    
    public SinhVien(int id, String ten, String lop, String nsinh, double gpa) throws ParseException {
        this.id = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.nsinh = new SimpleDateFormat("dd/MM/yyyy").parse(nsinh);
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(nsinh) +
                " " + String.format("%.2f", gpa);
    }
    
}
