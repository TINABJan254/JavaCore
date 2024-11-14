package j05049_liet_ke_nhap_xuat_hang_theo_nhom;

public class MatHang {
    private String maMH;
    private long soLuongNhap;
    
    public MatHang(String maMH, long soLuongNhap){
        this.maMH = maMH;
        this.soLuongNhap = soLuongNhap;
    }
    
    public String getMaMH(){
        return maMH;
    }
    
    public long soLuongXuat(){
        if (maMH.charAt(0) == 'A'){
            return Math.round(soLuongNhap * 0.6);
        }
        return Math.round(soLuongNhap * 0.7);
    }
    
    public long donGia(){
        if (maMH.charAt(maMH.length() - 1) == 'Y'){
            return 110000;
        }
        return 135000;
    }
    
    public long tien(){
        return soLuongXuat() * donGia();
    }
    
    public long thue(){
        char c1 = maMH.charAt(0);
        char c2 = maMH.charAt(maMH.length() - 1);
        if (c1 == 'A' && c2 == 'Y'){
            return Math.round(0.08 * tien());
        }
        if (c1 == 'A' && c2 == 'N'){
            return Math.round(0.11 * tien());
        }
        if (c1 == 'B' && c2 == 'Y'){
            return Math.round(0.17 * tien());
        }
        return Math.round(0.22 * tien());
    }
    
    @Override
    public String toString(){
        return maMH + " " + soLuongNhap + " " + soLuongXuat() + " " + donGia() + " " + tien() + " " + thue();
    }
}
