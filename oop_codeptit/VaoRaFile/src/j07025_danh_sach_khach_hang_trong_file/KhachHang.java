package j07025_danh_sach_khach_hang_trong_file;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KhachHang {
    private String maKH, tenKH, gioiTinh, diaChi;
    private Date ngaySinh;
    
    public KhachHang(String maKH, String tenKH, String gioiTinh, String ngaySinh, String diaChi) throws ParseException{
        this.maKH = maKH;
        this.tenKH = chuanHoa(tenKH);
        this.gioiTinh = gioiTinh;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diaChi = diaChi;
    }
    
    private String chuanHoa(String s){
        String[] a = s.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : a){
            res.append(x.substring(0, 1).toUpperCase());
            res.append(x.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    
    public Date getNgaySinh(){
        return ngaySinh;
    }
    
    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + gioiTinh + " " + diaChi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh);
    }
}
