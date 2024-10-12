package j07046_danh_sach_luu_tru;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Khach {
    private String maKH, tenKH, maPhong;
    private Date checkIn, checkOut;
    
    public Khach(int id, String tenKH, String maPhong, String checkIn, String checkOut) throws ParseException{
        this.maKH = String.format("KH%02d", id);
        this.tenKH = tenKH;
        this.maPhong = maPhong;
        this.checkIn = new SimpleDateFormat("dd/MM/yyyy").parse(checkIn);
        this.checkOut = new SimpleDateFormat("dd/MM/yyyy").parse(checkOut);
    }
    
    public long soNgayLuuTru(){
        //getTime() return millisecond (from 1/1/1970 to this date)
        long differenceInDays = (checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24);
        return differenceInDays;
    }
    
    @Override
    public String toString(){
        return maKH + " " + tenKH + " " + maPhong + " " + soNgayLuuTru();
    }
}
