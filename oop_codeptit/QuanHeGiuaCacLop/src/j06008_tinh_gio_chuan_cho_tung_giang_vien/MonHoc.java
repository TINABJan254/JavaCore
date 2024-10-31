package j06008_tinh_gio_chuan_cho_tung_giang_vien;

public class MonHoc {
    private String maMH, ten;
    
    public MonHoc(String maMH, String ten){
        this.maMH = maMH;
        this.ten = ten;
    }
    
    public String getMaMH(){
        return this.maMH;
    }
    
    public String getTenMH(){
        return this.ten;
    }
}
