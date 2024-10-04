package j07045_loai_phong;

import java.util.*;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, ten;
    private double donGia, phiDV;
    
    public LoaiPhong(String line){
        Scanner lineScan = new Scanner(line);
        this.id     = lineScan.next();
        this.ten    = lineScan.next();
        this.donGia = lineScan.nextDouble();
        this.phiDV  = lineScan.nextDouble();
    }
    
    public String getTen(){
        return ten;
    }
    
    @Override
    public int compareTo(LoaiPhong other) {
        return this.ten.compareTo(other.ten);
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + String.format("%.0f %.2f", donGia, phiDV);
    }
}
