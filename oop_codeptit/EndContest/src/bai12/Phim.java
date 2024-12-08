package bai12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Phim {
    private String maPhim, tenPhim;
    private Date ngayChieu;
    private int soTap;
    private TheLoai theLoai;

    public Phim(String maPhim, TheLoai theLoai, String ngayChieu, String tenPhim, int soTap) throws ParseException {
        this.maPhim = maPhim;
        this.tenPhim = tenPhim;
        this.ngayChieu = new SimpleDateFormat("dd/MM/yyyy").parse(ngayChieu);
        this.soTap = soTap;
        this.theLoai = theLoai;
    }
    
    public Date getNgayChieu(){
        return this.ngayChieu;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public int getSoTap() {
        return soTap;
    }
    
    @Override
    public String toString(){
        return maPhim + " " + theLoai + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayChieu) + " " + tenPhim + " " + soTap;
    }
}
