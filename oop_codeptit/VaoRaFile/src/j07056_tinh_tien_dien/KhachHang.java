package j07056_tinh_tien_dien;

import java.util.StringTokenizer;

public class KhachHang {
    private String maKH, ten, loaiHo;
    private int soDau, soCuoi;
    
    public KhachHang(String maKH, String ten, String loaiHo, int soDau, int soCuoi){
        this.maKH = maKH;
        this.ten = chuanHoa(ten);
        this.loaiHo = loaiHo;
        this.soDau = soDau;
        this.soCuoi = soCuoi;
    }
    
    public String chuanHoa(String s){
        StringBuilder res = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s.toLowerCase());
        while (st.hasMoreTokens()){
            String word = st.nextToken();
            res.append(Character.toUpperCase(word.charAt(0)));
            res.append(word.substring(1));
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    public int dinhMuc(){
        int d;
        if (loaiHo.equals("A")){
            d = 100;
        } else if (loaiHo.equals("B")){
            d = 500;
        } else {
            d = 200;
        }
        return d;
    }

    public int soDien(){
        return soCuoi - soDau;
    }
    
    public long tienTrongDinhMuc(){
        if (soDien() < dinhMuc()){
            return soDien() * 450;
        }
        return dinhMuc() * 450;
    }
    
    public long tienVuotDinhMuc(){
        if (soDien() > dinhMuc()){
            return (soDien() - dinhMuc()) * 1000;
        }
        return 0;
    }
    
    public long thueVAT(){
        return (long)(0.05 * tienVuotDinhMuc());
    }
    
    public long tienPhaiNop(){
        return tienTrongDinhMuc() + tienVuotDinhMuc() + thueVAT();
    }
    
    @Override
    public String toString(){
        return maKH + " " + ten + " " + tienTrongDinhMuc() + " " + tienVuotDinhMuc() + " " + thueVAT() + " " + tienPhaiNop();
    }
    
}
