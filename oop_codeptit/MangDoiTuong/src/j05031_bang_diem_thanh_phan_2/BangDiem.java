package j05031_bang_diem_thanh_phan_2;

public class BangDiem {
    private String msv, tenSV, lopSV;
    private double diem1, diem2, diem3;
    
    public BangDiem(String msv, String tenSV, String lopSV, double diem1, double diem2, double diem3){
        this.msv = msv;
        this.tenSV = tenSV;
        this.lopSV = lopSV;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    public String getMsv(){
        return msv;
    }
    
    public String getTenSV(){
        return tenSV;
    }
    
    @Override
    public String toString(){
        return msv + " " + tenSV + " " + lopSV + " " + String.format("%.1f %.1f %.1f", diem1, diem2, diem3);
    }
    
}
