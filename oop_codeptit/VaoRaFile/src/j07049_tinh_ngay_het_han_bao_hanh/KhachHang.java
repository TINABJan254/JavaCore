package j07049_tinh_ngay_het_han_bao_hanh;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class KhachHang {
    private String maKH, tenKH, diaChi;
    private int soLuongMua;
    private LocalDate ngayMua;
    private SanPham sanPham;
    
    public KhachHang(String maKH, String tenKH, String diaChi, SanPham sanPham, int soLuongMua, String ngayMua) throws ParseException{
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.sanPham = sanPham;
        this.soLuongMua = soLuongMua;
        this.ngayMua = LocalDate.parse(ngayMua, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
    public long thanhToan(){
        return soLuongMua * sanPham.getGiaBan();
    }
    
    public LocalDate hetHan(){
        LocalDate hetHan = this.ngayMua.plusMonths(sanPham.getThoiHanBH());
        return hetHan;
    }
    
    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + diaChi + " " + sanPham.getMaSP() + " " + thanhToan() 
                + " " + hetHan().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
