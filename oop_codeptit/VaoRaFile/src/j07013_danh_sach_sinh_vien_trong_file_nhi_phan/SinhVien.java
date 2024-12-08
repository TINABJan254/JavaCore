package j07013_danh_sach_sinh_vien_trong_file_nhi_phan;

import java.io.*;
import java.text.*;
import java.util.*;

public class SinhVien implements Serializable {
    private String ma, ten, lop;
    private Date ngaySinh;
    private float gpa;
    
    public SinhVien(int id, String ten, String lop, String ngaySinh, float gpa) throws ParseException{
        this.ma = String.format("B20DCCN%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + " " + String.format("%.2f", gpa);
    }
}
