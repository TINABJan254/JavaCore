package j07074_lich_giang_day_theo_mon_hoc;

public class LopHocPhan {
    private String maNhom, tenGV, phongHoc;
    private int ngayDay, kipHoc;
    private MonHoc monHoc;
    
    public LopHocPhan(String maNhom, MonHoc monHoc, int ngayDay, int kipHoc, String tenGV, String phongHoc){
        this.maNhom = maNhom;
        this.monHoc = monHoc;
        this.ngayDay = ngayDay;
        this.kipHoc = kipHoc;
        this.tenGV = tenGV;
        this.phongHoc = phongHoc;
    }
    
    public MonHoc getMonHoc(){
        return this.monHoc;
    }
    
    public int getNgayDay(){
        return this.ngayDay;
    }
    
    public int getKipHoc(){
        return this.kipHoc;
    }
    
    public String getTenGV(){
        return this.tenGV;
    }
    
    @Override
    public String toString(){
        return maNhom + " " + ngayDay + " " + kipHoc + " " + tenGV + " " + phongHoc;
    }
}
