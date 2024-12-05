package j07059_danh_sach_ca_thi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CaThi {
    private String ma;
    private Date ngayThi;
    private String gioThi, phongThi;

    public CaThi(String ma, String ngayThi, String gioThi, String phongThi) throws ParseException {
        this.ma = ma;
        this.ngayThi = new SimpleDateFormat("dd/MM/yyyy").parse(ngayThi);
        this.gioThi = gioThi;
        this.phongThi = phongThi;
    }
    
    public String getMa(){
        return this.ma;
    }
    
    public Date getNgayThi(){
        return this.ngayThi;
    }
    
    public String getGio(){
        return this.gioThi.substring(0, 2);
    }
    
    public String getPhut(){
        return this.gioThi.substring(3);
    }
    
    @Override
    public String toString(){
        return ma + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayThi) + " " + gioThi + " " + phongThi;
    }
}
