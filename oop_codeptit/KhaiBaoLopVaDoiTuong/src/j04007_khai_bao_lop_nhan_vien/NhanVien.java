package j04007_khai_bao_lop_nhan_vien;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class NhanVien {
    private String id, ten, gtinh, dchi, masothue;
    private Date ngaysinh, ngayky;
    
    public NhanVien(String ten, String gtinh, String ngaysinh, String dchi, String masothue, String ngayky) throws ParseException{
        this.id = "00001";
        this.ten = ten;
        this.gtinh = gtinh;
        this.dchi = dchi;
        this.masothue = masothue;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.ngayky   = new SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
    }
    
    public String toString(){
        return id + " " + ten + " " + gtinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) 
                + " " + dchi + " " + masothue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayky);
    }
    
}
