package j06003_quan_ly_bai_tap_nhom_1;

public class SinhVien {

    private String maSV, tenSV, sdt;
    private Nhom nhom;

    public SinhVien(String maSV, String tenSV, String sdt, Nhom nhom) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.sdt = sdt;
        this.nhom = nhom;
    }
    
    public Nhom getNhom(){
        return this.nhom;
    }
    
    @Override
    public String toString(){
        return maSV + " " + tenSV + " " + sdt;
    }

}
