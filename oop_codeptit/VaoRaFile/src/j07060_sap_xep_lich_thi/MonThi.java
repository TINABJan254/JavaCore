package j07060_sap_xep_lich_thi;

public class MonThi {
    private String maMon, tenMon, hinhThucThi;

    public MonThi(String maMon, String tenMon, String hinhThucThi) {
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }
    
    public String getMaMon(){
        return this.maMon;
    }
    
    @Override
    public String toString(){
        return tenMon;
    }
}
