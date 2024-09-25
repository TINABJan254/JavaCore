package j05007_sap_xep_danh_sach_doi_tuong_nhan_vien;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class NhanVien {
    
    private String id, ten, gtinh, dchi, masothue;
    private Date ngaysinh, ngayky;

    public NhanVien(int id, String ten, String gtinh, String ngaysinh,
            String dchi, String masothue, String ngayky) throws ParseException {
        this.id = String.format("%05d", id);
        this.ten = ten;
        this.gtinh = gtinh;
        this.dchi = dchi;
        this.masothue = masothue;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.ngayky = new SimpleDateFormat("dd/MM/yyyy").parse(ngayky);
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }
    
    @Override
    public String toString() {
        return id + " " + ten + " " + gtinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh) + " "
                + dchi + " " + masothue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayky);
    }
}
