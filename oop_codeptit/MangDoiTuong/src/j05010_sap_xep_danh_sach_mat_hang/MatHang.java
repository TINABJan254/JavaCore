package j05010_sap_xep_danh_sach_mat_hang;

import java.util.*;

public class MatHang implements Comparable<MatHang>{
    private String maMH, ten, nhomHang;
    private double giaMua, giaBan, loiNhuan; 
    
    public MatHang(int id, String ten, String nhomHang, double giaMua, double giaBan){
        this.maMH = id + "";
        this.ten = ten;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    
    @Override
    public int compareTo(MatHang other) {
        if (this.loiNhuan > other.loiNhuan){
            return -1;
        }
        return 1;
    }
    
    @Override
    public String toString(){
        return maMH + " " + ten + " " + nhomHang + " " + String.format("%.2f", loiNhuan);
    }
    
}
