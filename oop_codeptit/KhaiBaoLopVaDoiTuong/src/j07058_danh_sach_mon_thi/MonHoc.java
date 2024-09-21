package j07058_danh_sach_mon_thi;

public class MonHoc {
    private String ma, ten, hinhThuc;
    
    public MonHoc(String ma, String ten, String hinhThuc){
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
    }
    
    public String getMa(){
        return ma;
    }
    
    @Override
    public String toString(){
        return  ma + " " + ten + " " + hinhThuc;
    }
}
