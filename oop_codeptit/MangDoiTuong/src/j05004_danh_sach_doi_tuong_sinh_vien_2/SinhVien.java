package j05004_danh_sach_doi_tuong_sinh_vien_2;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SinhVien {
    private String msv, ten, lop;
    private Date ngaysinh;
    private double gpa;
    
    public SinhVien(){
        this.ten = "";
        this.lop = "";
        this.gpa = 0;
        this.msv = "";
    }
    
    public SinhVien(int msv, String ten, String lop, String ngaysinh, double gpa) throws ParseException{
        this.msv = "B20DCCN" + String.format("%03d", msv);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
        ChuanHoa();
    }
    
    public void ChuanHoa(){
        String[] a = ten.trim().split("\\s+"); //note: nhớ trim() trước khi split
        String res = "";
        for (int i = 0; i < a.length; i++){
            res += Character.toUpperCase(a[i].charAt(0));
            for (int j = 1; j < a[i].length(); j++){
                res += Character.toLowerCase(a[i].charAt(j));
            }
            res += " ";
        }
        res = res.trim();
        this.ten = res;
    }
    
    @Override
    public String toString(){
        return msv + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", gpa);
    }
}
