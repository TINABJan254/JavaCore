package thuc_hanh1.thuc_tap_co_so;

public class DeTai {
    private String tenGV, tenDT, maDT;
    
    public DeTai(int maDT, String tenGV, String tenDT){
        this.maDT = String.format("DT%03d", maDT);
        this.tenGV = tenGV;
        this.tenDT = tenDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public String getMaDT() {
        return maDT;
    }
    
    @Override
    public String toString(){
        return tenGV + " " + tenDT;
    }
}
