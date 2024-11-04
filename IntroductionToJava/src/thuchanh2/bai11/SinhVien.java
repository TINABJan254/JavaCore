package thuchanh2.bai11;

public class SinhVien {
    private String maSV, hoTen, lop, email, sdt;
    
    public SinhVien(String maSV, String hoTen, String lop, String email, String sdt) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }
    
    public String getMaSV(){
        return maSV;
    }

    public String getSdt() {
        return sdt;
    }
    
    @Override
    public String toString(){
        return maSV + " " + hoTen;
    }
    
}
