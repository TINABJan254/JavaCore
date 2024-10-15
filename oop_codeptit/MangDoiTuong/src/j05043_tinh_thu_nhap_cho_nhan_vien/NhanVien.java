package j05043_tinh_thu_nhap_cho_nhan_vien;

public class NhanVien {
    private String id, hoTen, chucVu;
    private double luongCB, ngayCong;
    
    public NhanVien(int id, String hoTen, String chucVu, double luongCB, double ngayCong){
        this.id = String.format("NV%02d", id);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
    }
    
    public double phuCap(){
        if (chucVu.equals("GD")){
            return 500;
        }
        if (chucVu.equals("PGD")){
            return 400;
        }
        if (chucVu.equals("TP")){
            return 300;
        }
        if (chucVu.equals("KT")){
            return 250;
        }
        return 100;
    }   
    
    public double luongChinh(){
        return luongCB * ngayCong;
    }
    
    public double tamUng(){
        double luong = luongChinh() + phuCap();
        if (luong * 2/3 < 25000){
            return Math.round((luong * 2/3)/1000) * 1000;
        }
        return 25000;
    }
    
    @Override
    public String toString(){
        return id + " " + hoTen + " " + 
                String.format("%.0f %.0f %.0f %.0f", phuCap(), luongChinh(), tamUng(), luongChinh() + phuCap() - tamUng());
    }
    
}


