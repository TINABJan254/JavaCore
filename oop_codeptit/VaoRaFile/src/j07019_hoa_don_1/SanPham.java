package j07019_hoa_don_1;

public class SanPham {
    private String maSP, tenSP;
    private long donGia1, donGia2;
    
    public SanPham(String maSP, String tenSP, long donGia1, long donGia2){
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia1 = donGia1;
        this.donGia2 = donGia2;
    }
    
    public String getMaSP(){
        return this.maSP;
    }
    
    public long getDonGia1(){
        return this.donGia1;
    }
    
    public long getDonGia2(){
        return this.donGia2;
    }
    
    public String getTenSP(){
        return this.tenSP;
    }
    
}
