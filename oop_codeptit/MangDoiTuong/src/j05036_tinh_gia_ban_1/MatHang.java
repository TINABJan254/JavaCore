package j05036_tinh_gia_ban_1;

public class MatHang {
    private String id, ten, donVi;
    private long donGia, soLuong;
    
    public MatHang(int id, String ten, String donVi, long donGia, long soLuong){
        this.id = String.format("MH%02d", id);
        this.ten = ten;
        this.donVi = donVi;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }
    
    public long phiVanChuyen(){
        return Math.round(donGia * soLuong * 0.05);
    }
    
    public long thanhTien(){
        return Math.round(donGia * soLuong + phiVanChuyen());
    }
    
    public long giaBan(){
        return Math.round(thanhTien() + thanhTien() * 0.02);
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + donVi + " " + phiVanChuyen() + " "
                + thanhTien() + " " + giaBan();
    }
}
