package thuchanh2.bai11;

public class DoAn {
    private SinhVien sinhVien;
    private String tenGV;
    private String deTai;

    public DoAn(SinhVien sinhVien, String tenGV, String deTai) {
        this.sinhVien = sinhVien;
        this.tenGV = tenGV;
        this.deTai = deTai;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }
    
    @Override
    public String toString(){
        return sinhVien + " " + tenGV + " " + deTai + " " + sinhVien.getSdt();
    }
    
}
