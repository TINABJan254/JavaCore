package j05003_danh_sach_doi_tuong_sinh_vien_1;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SinhVien {
    private String msv, ten, lop;
    private Date ngaysinh;
    private double gpa;
    
    public SinhVien(int msv, String ten, String lop, String ngaysinh, double gpa) throws ParseException{
        this.msv = "B20DCCN" + String.format("%03d", msv);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return msv + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", gpa);
    }
    
}
