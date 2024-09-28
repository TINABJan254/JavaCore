package j05029_danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_2;

public class DoanhNghiep {
    private String id, ten;
    private int soLuong;
    
    public DoanhNghiep(String id, String ten, int soLuong){
        this.id = id;
        this.ten = ten;
        this.soLuong = soLuong;
    }
    
    public int getSoLuong(){
        return soLuong;
    }
    
    public String getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + soLuong;
    }
}
