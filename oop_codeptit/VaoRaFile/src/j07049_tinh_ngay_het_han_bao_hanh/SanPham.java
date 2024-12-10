package j07049_tinh_ngay_het_han_bao_hanh;

public class SanPham {
    private String maSP, tenSP;
    private long giaBan;
    private int thoiHanBH;
    
    public SanPham(String maSP, String tenSP, long giaBan, int thoiHanBH){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaBan = giaBan;
        this.thoiHanBH = thoiHanBH;
    }
    
    public long getGiaBan(){
        return this.giaBan;
    }
    
    public long getThoiHanBH(){
        return this.thoiHanBH;
    }
    
    public String getMaSP(){
        return this.maSP;
    }
}
