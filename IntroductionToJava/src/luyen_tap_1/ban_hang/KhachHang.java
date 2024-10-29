package luyen_tap_1.ban_hang;

public class KhachHang {
    private String maKH,tenKH, gtinh, nsinh, dchi;
    
    public KhachHang(int id, String tenKH, String gtinh, String nsinh, String dchi){
        this.maKH = String.format("KH%03d", id); 
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
