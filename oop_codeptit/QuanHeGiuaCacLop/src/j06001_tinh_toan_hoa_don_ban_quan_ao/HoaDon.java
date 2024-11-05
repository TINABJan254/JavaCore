package j06001_tinh_toan_hoa_don_ban_quan_ao;

public class HoaDon {
    private String maHD;
    private long soLuong;
    private SanPham sanPham;
    
    public HoaDon(String maHD, SanPham sanPham, long soLuong){
        this.maHD = maHD;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }
    
    public long thanhTien(){
        if (maHD.charAt(2) == '1'){
            return soLuong * sanPham.getGia1();
        }
        return soLuong * sanPham.getGia2();
    }
    
    public long giamGia(){
        if (soLuong >= 150){
            return (long)(thanhTien() * 0.5);
        } else if (soLuong >= 100){
            return (long)(thanhTien() * 0.3);
        } else if (soLuong >= 50){
            return (long)(thanhTien() * 0.15);
        }
        return 0;
    }
    
    public long phaiTra(){
        return thanhTien() - giamGia();
    }
    
    @Override
    public String toString(){
        return maHD + " " + sanPham + " " + giamGia() + " " + phaiTra();
    }
}
