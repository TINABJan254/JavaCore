package thuchanh3.bai5;

public class HocPhan {
    private GiangVien giangVien;
    private MonHoc monHoc;
    private double gioChuan;
    
    public HocPhan(GiangVien giangVien, MonHoc monHoc, double gioChuan){
        this.giangVien = giangVien;
        this.monHoc = monHoc;
        this.gioChuan = gioChuan;
    }
    
    public GiangVien getGiangVien(){
        return giangVien;
    }
    
    public double getGioChuan(){
        return gioChuan;
    }
    
}
