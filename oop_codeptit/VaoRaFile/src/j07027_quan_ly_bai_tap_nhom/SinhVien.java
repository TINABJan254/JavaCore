package j07027_quan_ly_bai_tap_nhom;

public class SinhVien {
    private String maSV, hoTen, sdt, baiTap;
    private int nhom;
    
    public SinhVien(String maSV, String hoTen, String sdt){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
    }
    
    public String getMaSV(){
        return this.maSV;
    }
    
    public void setBaitap(String baiTap){
        this.baiTap = baiTap;
    }
    
    public void setNhom(int nhom){
        this.nhom = nhom;
    }
    
    @Override
    public String toString(){
        return maSV + " " + hoTen + " " + sdt + " " + nhom + " " + baiTap;
    }
}
