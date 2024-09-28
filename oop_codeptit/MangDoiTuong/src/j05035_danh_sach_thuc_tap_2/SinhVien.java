package j05035_danh_sach_thuc_tap_2;

public class SinhVien {
    private int stt;
    private String id, ten, lop, email, doanhNghiep;
    
    public SinhVien(int stt, String id, String ten, String lop, String email, String doanhNghiep){
        this.stt = stt;
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.doanhNghiep = doanhNghiep;
    }
    
    public String getTen(){
        return ten;
    }
    
    public String getId(){
        return id;
    }
    
    public String getDoanhNghiep(){
        return doanhNghiep;
    }
    
    @Override
    public String toString(){
        return stt + " " + id + " " + ten + " " + lop + " " + email + " " + doanhNghiep;
    }
}
