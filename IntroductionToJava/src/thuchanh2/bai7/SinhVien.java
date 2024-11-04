package thuchanh2.bai7;

public class SinhVien {
    private String maSV, hoTen, lop, email, sdt, gioiTinh, sizeDo;

    public SinhVien(String maSV, String hoTen, String lop, String email, String sdt, String gioiTinh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }
    
    public String getSizeDo(){
        return sizeDo;
    }
    
    public void setSizeDo(String sizeDo){
        this.sizeDo = sizeDo;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
    
    @Override
    public String toString(){
        return maSV + " " + hoTen + " " + lop + " " + email + " " + sdt;
    }
}
