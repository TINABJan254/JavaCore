package j07074_lich_giang_day_theo_mon_hoc;

public class MonHoc {
    private String maMH, tenMH;
    private int soTC;
    
    public String getTenMH(){
        return tenMH;
    }
    
    public String getMaMH(){
        return maMH;
    }
    
    public MonHoc(String maMH, String tenMH, int soTC){
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.soTC = soTC;
    }   
    
}
