package j07037_danh_sach_doanh_nghiep;

public class DoanhNghiep {
    private String id, ten;
    private int soSV;
    
    public DoanhNghiep(String id, String ten, int soSV){
        this.id = id;
        this.ten = ten;
        this.soSV = soSV;
    }
    
    public String getId(){
        return id;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + soSV;
    }
}
