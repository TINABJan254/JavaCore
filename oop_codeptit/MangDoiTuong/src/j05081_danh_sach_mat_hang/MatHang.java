package j05081_danh_sach_mat_hang;

import java.util.*;

public class MatHang implements Comparable<MatHang>{
    private String maMH, ten, donVi;
    private int giaMua, giaBan, loiNhuan; 
    
    public MatHang(int id, String ten, String donVi, int giaMua, int giaBan){
        this.maMH = "MH" + String.format("%03d", id);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }
    
    @Override
    public int compareTo(MatHang other) {
        if (this.loiNhuan != other.loiNhuan){
            return other.loiNhuan - this.loiNhuan;
        }
        return this.maMH.compareTo(other.maMH);
    }
    
    @Override
    public String toString(){
        return maMH + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
    
}
