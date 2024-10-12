package j07048_danh_sach_san_pham;

public class SanPham {
    private String maSP, tenSP;
    private long giaBan, baoHanh;
    
    public SanPham(String maSP, String tenSP, long giaBan, long baoHanh){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.baoHanh = baoHanh;
    }

    public String getMaSP() {
        return maSP;
    }

    public long getGiaBan() {
        return giaBan;
    }
    
    @Override
    public String toString(){
        return maSP + " " + tenSP + " " + giaBan + " " + baoHanh;
    }
}
