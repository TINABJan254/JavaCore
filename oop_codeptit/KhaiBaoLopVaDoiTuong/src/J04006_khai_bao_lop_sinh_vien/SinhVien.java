package J04006_khai_bao_lop_sinh_vien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String ten, lop, msv;
    private Date nsinh;
    private double gpa;
       
    public SinhVien(String ten, String lop, String nsinh, double gpa) throws ParseException{
        this.msv = "B20DCCN001";
        this.ten = ten;
        this.lop = lop;
        this.gpa = gpa;
        this.nsinh = new SimpleDateFormat("dd/MM/yyyy").parse(nsinh);
    }
    
    public String toString(){
        return msv + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(nsinh) + " "
                + String.format("%.2f", gpa);
    }
    
}
