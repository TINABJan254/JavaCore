package j06006_quan_ly_ban_hang2;

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
    
    public int thanhTien(){
        return soLuong * matHang.getGiaBan();
    }
    
    public int loiNhuan(){
        return soLuong * matHang.getGiaBan() - soLuong * matHang.getGiaMua();
    }
    
    @Override
    public String toString(){
        return maHD + " " + khachHang + " " + matHang + " " + soLuong + " " + thanhTien() + " " + loiNhuan();
    }
}
