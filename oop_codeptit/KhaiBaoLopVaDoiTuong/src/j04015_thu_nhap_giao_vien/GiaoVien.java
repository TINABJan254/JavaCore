package j04015_thu_nhap_giao_vien;

public class GiaoVien {
    private String ma, ten;
    private int luongCB;
    
    public GiaoVien(String ma, String ten, int luongCB){
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
    }
    
    public String chucVu(){
        return ma.substring(0, 2);
    }
    
    public int heSo(){
        return Integer.parseInt(ma.substring(2));
    }
    
    public int phuCap(){
        if (chucVu().equals("HT")){
            return 2000000;
        }
        else if (chucVu().equals("HP")){
            return 900000;
        }
        return 500000;
    }
    
    public int thuNhap(){
        return luongCB * heSo() + phuCap();
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + heSo() + " " + phuCap() + " " + thuNhap();
    }
    
}
