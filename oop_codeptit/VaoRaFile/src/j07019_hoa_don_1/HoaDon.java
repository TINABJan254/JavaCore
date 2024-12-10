package j07019_hoa_don_1;

public class HoaDon {
    private String maHD;
    private int soLuong;
    private SanPham sanPham;
    
    public HoaDon(String maHD, SanPham sanPham, int soLuong){
        this.maHD = maHD;
        this.sanPham = sanPham;
        this.soLuong = soLuong;
    }
        
    public long thanhTien(){
        if (maHD.charAt(2) == '1'){
            return soLuong * sanPham.getDonGia1();
        }
        return soLuong * sanPham.getDonGia2();
    }
    
    public long giamGia(){
        if (soLuong >= 150){
            return (long)(0.5 * thanhTien());
        } else if (soLuong >= 100){
            return (long)(0.3 * thanhTien());
        } else if (soLuong >= 50){
            return (long)(0.15 * thanhTien());
        }
        return 0;
    }
    
    public long phaiTra(){
        return thanhTien() - giamGia();
    }
    
    @Override
    public String toString(){
        return maHD + " " + sanPham.getTenSP() + " " + giamGia() + " " + phaiTra();
    }
}
