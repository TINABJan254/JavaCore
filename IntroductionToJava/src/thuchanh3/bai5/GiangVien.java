package thuchanh3.bai5;

public class GiangVien {
    private String maGV, tenGV;
    
    public GiangVien(String maGV, String tenGV){
        this.maGV = maGV;
        this.tenGV = tenGV;
    }
    
    public String getTenGV(){
        return tenGV;
    }
    public String getMaSV(){
        return maGV;
    }
    
}
