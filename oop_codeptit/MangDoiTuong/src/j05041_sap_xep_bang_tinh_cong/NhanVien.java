package j05041_sap_xep_bang_tinh_cong;

public class NhanVien {
    private String id, ten, chucVu;
    private long luongNgay, ngayCong;
    
    public NhanVien(int id, String ten, long luongNgay, long ngayCong, String chucVu){
        this.id = String.format("NV%02d", id);
        this.ten = ten;
        this.luongNgay = luongNgay;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    
    public long luongThang(){
        return luongNgay * ngayCong;
    }
    
    public long thuong(){
        if (ngayCong >= 25){
            return (long)(luongThang() * 0.2);
        }
        else if (ngayCong >= 22){
            return (long)(luongThang() * 0.1);
        }
        return 0;
    }
    
    public long phuCap(){
        if (chucVu.equals("GD")){
            return 250000;
        }
        else if (chucVu.equals("PGD")){
            return 200000;
        }
        else if (chucVu.equals("TP")){
            return 180000;
        }
        return 150000;
    }
    
    public long thucLinh(){
        return luongThang() + thuong() + phuCap();
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + luongThang() + " " + thuong() + 
                " " + phuCap() + " " + thucLinh();
    }
}
