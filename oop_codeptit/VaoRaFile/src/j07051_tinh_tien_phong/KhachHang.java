package j07051_tinh_tien_phong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    private String maKH, tenKH, soPhong;
    private Date ngayNhan, ngayTra;
    private long tienDv;
    
    public KhachHang(String maKH, String tenKH, String soPhong, String ngayNhan, String ngayTra, long tienDv) throws ParseException{
        this.maKH = maKH;
        this.tenKH = chuanHoa(tenKH);
        this.soPhong = soPhong;
        this.ngayNhan = new SimpleDateFormat("dd/MM/yyyy").parse(ngayNhan);
        this.ngayTra = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTra);
        this.tienDv = tienDv;
    }
    
    private String chuanHoa(String s){
        s = s.toLowerCase();
        String[] a = s.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : a){
            res.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++){
                res.append(x.charAt(i));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    public long soNgayO(){
        long t = (ngayTra.getTime() - ngayNhan.getTime()) / (1000 * 60 * 60 * 24);
        return t + 1;
    }
    
    public long tienPhong(){
        long t = soPhong.charAt(0) - '0';
        if (t == 1){
            return soNgayO() * 25;
        } else if (t == 2){
            return soNgayO() * 34;
        } else if (t == 3){
            return soNgayO() * 50;
        }
        return soNgayO() * 80;
    }
    
    public long thanhTien(){
        return tienPhong() + tienDv;
    }
    
    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + soPhong + " " + soNgayO() + " " + thanhTien();
    }
    
}
