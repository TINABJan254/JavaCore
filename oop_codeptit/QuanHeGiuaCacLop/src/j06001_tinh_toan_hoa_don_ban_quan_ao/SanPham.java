package j06001_tinh_toan_hoa_don_ban_quan_ao;

public class SanPham {
    private String maLoai, tenSP;
    private long gia1, gia2;
    
    public SanPham(String maLoai, String tenSP, long gia1, long gia2){
        this.maLoai = maLoai;
        this.tenSP = tenSP;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
    
    public String getMaLoai(){
        return maLoai;
    }
    
    public long getGia1(){
        return gia1;
    }
    
    public long getGia2(){
        return gia2;
    }
    
    @Override
    public String toString(){
        return tenSP;
    }
}
