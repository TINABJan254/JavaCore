package j06008_tinh_gio_chuan_cho_tung_giang_vien;

public class GiangVien {
    private String maGV, tenGV;
    
    public GiangVien(String maGV, String tenGV){
        this.maGV = maGV;
        this.tenGV = tenGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getMaGV() {
        return maGV;
    }
    
}
