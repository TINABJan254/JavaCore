package thuchanh3.bai3;

public class SinhVien {
    private String maSV, ten, lop, email, sdt;
    
    public SinhVien(String maSV, String ten, String lop, String email, String sdt){
        this.maSV = maSV;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    
    public String getLop(){
        return lop;
    }
    
    public String getMaSV(){
        return maSV;
    }
    
    @Override
    public String toString(){
        return maSV + " " + ten + " " + lop + " " + email + " " + sdt;
    }
    
}
