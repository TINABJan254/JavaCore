package thuc_hanh1.bao_cao_ttcs;

public class HoiDong {
    private String maSV, maDT, maHD;
    
    public HoiDong(String maSV, String maDT, String maHD){
        this.maSV = maSV;
        this.maDT = maDT;
        this.maHD = maHD;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getMaHD() {
        return maHD;
    }

    public String getMaDT() {
        return maDT;
    }
}
