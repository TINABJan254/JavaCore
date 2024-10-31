package j06008_tinh_gio_chuan_cho_tung_giang_vien;

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
    
    public MonHoc getMonHoc(){
        return monHoc;
    }
    
    public double getGioChuan(){
        return gioChuan;
    }
    
}
