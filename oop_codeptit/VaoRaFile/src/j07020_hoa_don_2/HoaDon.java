package j07020_hoa_don_2;

public class HoaDon {
    private String maHD;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(String maHD, KhachHang khachHang, MatHang matHang, int soLuong) {
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.soLuong = soLuong;
    }
    
    public long thanhTien(){
        return (long) soLuong * matHang.getGiaBan();
    }
    
    @Override
    public String toString(){
        return maHD + " " + khachHang + " " + matHang + " " + soLuong + " " + thanhTien();
    }
}
