package j06005_quan_ly_ban_hang1;

public class HoaDon {
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;
    
    public HoaDon(String maHD, KhachHang khachHang, MatHang matHang, int soLuong){
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    
    @Override
    public String toString(){
        return maHD + " " + khachHang + " " + matHang + " " + soLuong + " " + soLuong * matHang.getGiaBan();
    }
}
