package j07073_dang_ky_hinh_thuc_giang_day;

public class MonHoc {
    private String maMH, ten;
    private int soTC;
    private String dayLT, dayTH;

    public MonHoc(String maMH, String ten, int soTC, String dayLT, String dayTH) {
        this.maMH = maMH;
        this.ten = ten;
        this.soTC = soTC;
        this.dayLT = dayLT;
        this.dayTH = dayTH;
    }
    
    public String getMaMH(){
        return this.maMH;
    }
    
    public String getDayTH(){
        return this.dayTH;
    }
    
    @Override
    public String toString(){
        return maMH + " " + ten + " " + soTC + " " + dayLT + " " + dayTH;
    }
}
