package j05047_bang_nhap_ke_kho_sap_xep_theo_chiet_khau;

public class MatHang {
    private String maMH, tenMH;
    private int soLuong;
    private double donGia;
    
    public MatHang(String maMH, String tenMH, int soLuong, double donGia){
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }
    
    public double chietKhau(){
        if (soLuong > 10){
            return donGia * soLuong * 0.05;
        }
        else if (soLuong >= 8 && soLuong <= 10){
            return donGia * soLuong * 0.02;
        }
        else if (soLuong >= 5 && soLuong < 8){
            return donGia * soLuong * 0.01;
        }
        return 0;
    }
    
    public double thanhTien(){
        return donGia * soLuong - chietKhau();
    }
    
    public String toString(){
        return maMH + " " + tenMH + " " + String.format("%.0f", chietKhau()) + " " + String.format("%.0f", thanhTien());
    }
}
