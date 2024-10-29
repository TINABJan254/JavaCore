package j06006_quan_ly_ban_hang2;

public class KhachHang {
    private String maKH, tenKH, gtinh, nsinh, dchi;
    
    public KhachHang(String maKH, String tenKH, String gtinh, String nsinh, String dchi){
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.gtinh = gtinh;
        this.nsinh = nsinh;
        this.dchi = dchi;
    }
    
    public String getMaKH(){
        return maKH;
    }
    
    @Override
    public String toString(){
        return tenKH + " " + dchi;
    }
    
}
