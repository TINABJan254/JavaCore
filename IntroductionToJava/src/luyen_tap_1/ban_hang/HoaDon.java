package luyen_tap_1.ban_hang;

public class HoaDon {
    
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;
    
    public HoaDon(int id, KhachHang khachHang, MatHang matHang, int soLuong){
        this.maHD = String.format("HD%03d", id);
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    
    @Override
    public String toString(){
        return maHD + " " + khachHang + " " + matHang + " " + soLuong + " " + soLuong * matHang.getGiaBan();
    }
}
