package j05048_bang_theo_doi_nhap_xuat_hang;

public class MatHang {
    private String maMH;
    private long soLuongNhap;
    
    public MatHang(String maMH, long soLuongNhap){
        this.maMH = maMH;
        this.soLuongNhap = soLuongNhap;
    }
    
    public long soLuongXuat(){
        if (maMH.charAt(0) == 'A'){
            return Math.round(0.6 * soLuongNhap);
        }
        return Math.round(0.7 * soLuongNhap);
    }
    
    public double donGia(){
        if (maMH.charAt(maMH.length() - 1) == 'Y'){
            return 110000;
        }
        return 135000;
    }
    
    public double tien(){
        return soLuongXuat() * donGia();
    }
    
    public double thue(){
        char c1 = maMH.charAt(0);
        char c2 = maMH.charAt(maMH.length() - 1);
        if (c1 == 'A' && c2 == 'Y'){
            return 0.08 * tien();
        }
        if (c1 == 'A' && c2 == 'N'){
            return 0.11 * tien();
        }
        if (c1 == 'B' && c2 == 'Y'){
            return 0.17 * tien();
        }
        return 0.22 * tien();
    }
    
    public String toString(){
        return maMH + " " + soLuongNhap + " " + soLuongXuat() + " " 
                + String.format("%.0f", donGia()) + " " + String.format("%.0f", tien()) + " " 
                + String.format("%.0f", thue());
    }
    
}
