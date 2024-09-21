package j04012_bai_toan_tinh_cong;

public class NhanVien {
    private String ma, ten, chucVu;
    private long luongCB, ngayCong;
    
    public NhanVien(String ten, long luongCB, long ngayCong, String chucVu){
        this.ma = "NV01";
        this.ten = ten;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.chucVu = chucVu;
    }
    
    public long luongThang(){
        return luongCB * ngayCong;
    }
    
    public long tienThuong(){
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
    
    public long thuNhap(){
        return luongThang() + tienThuong() + phuCap();
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + luongThang() + " " + tienThuong() + " " + phuCap() + " " + thuNhap();
    }
    
}
