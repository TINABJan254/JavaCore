package j07084_thoi_gian_online_lien_tuc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String hoTen;
    private Date tgBatDau, tgKetThuc;
    
    public SinhVien(String hoTen, String tgBatDau, String tgKetThuc) throws ParseException{
        this.hoTen = hoTen;
        this.tgBatDau = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tgBatDau);
        this.tgKetThuc = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").parse(tgKetThuc);
    }
    
    public String getHoTen(){
        return this.hoTen;
    }
    
    public long tgOnline(){
        return (tgKetThuc.getTime() - tgBatDau.getTime()) / (1000 * 60);
    }
    
    @Override
    public String toString(){
        return hoTen + " " + tgOnline();
    }
}
