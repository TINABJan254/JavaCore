package j07060_sap_xep_lich_thi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CaThi {
    private String maCa;
    private LocalDate ngayThi;
    private LocalTime gioThi;
    private String phongThi;

    public CaThi(String maCa, String ngayThi, String gioThi, String phongThi) {
        this.maCa = maCa;
        this.ngayThi = LocalDate.parse(ngayThi, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        this.gioThi = LocalTime.parse(gioThi, DateTimeFormatter.ofPattern("HH:mm"));
        this.phongThi = phongThi;
    }

    public String getMaCa() {
        return maCa;
    }

    public LocalDate getNgayThi() {
        return ngayThi;
    }

    public LocalTime getGioThi() {
        return gioThi;
    }
    
    @Override
    public String toString(){
        return ngayThi.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " " + gioThi.format(DateTimeFormatter.ofPattern("HH:mm")) 
                + " " + phongThi;
    }
    
}
