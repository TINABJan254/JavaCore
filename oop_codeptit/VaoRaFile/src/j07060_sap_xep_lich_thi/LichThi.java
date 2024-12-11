package j07060_sap_xep_lich_thi;

public class LichThi {
    private CaThi caThi;
    private MonThi monThi;
    private String maNhom;
    private int soLuong;

    public LichThi(CaThi caThi, MonThi monThi, String maNhom, int soLuong) {
        this.caThi = caThi;
        this.monThi = monThi;
        this.maNhom = maNhom;
        this.soLuong = soLuong;
    }

    public CaThi getCaThi() {
        return caThi;
    }

    public MonThi getMonThi() {
        return monThi;
    }
    
    
    
    @Override
    public String toString(){
        return caThi + " " + monThi + " " + maNhom + " " + soLuong;
    }
}
