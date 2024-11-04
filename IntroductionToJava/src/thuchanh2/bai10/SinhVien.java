package thuchanh2.bai10;

public class SinhVien {
    private String maSV, tenSV, lop, email, sdt;
    
    public SinhVien(String maSV, String tenSV, String lop, String email, String sdt){
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString(){
        return maSV + " " + tenSV + " " + lop + " " + email + " " + sdt;
    }
    
}
