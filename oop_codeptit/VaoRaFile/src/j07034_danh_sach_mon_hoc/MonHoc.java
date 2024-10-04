
package j07034_danh_sach_mon_hoc;

public class MonHoc {
    private String id, ten;
    private int soTC;
    
    public MonHoc(String id, String ten, int soTC){
        this.id = id;
        this.ten = ten;
        this.soTC = soTC;
    }
    
    public String getTen(){
        return ten;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + soTC;
    }
    
}
