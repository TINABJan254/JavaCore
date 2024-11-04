package thuchanh2.bai9;

public class DaiHoc {
    private String maTruong, tenTruong;
    
    public DaiHoc(String maTruong, String tenTruong){
        this.maTruong = maTruong;
        this.tenTruong = tenTruong;
    }
    
    public String getTenTruong(){
        return tenTruong;
    }
    
    public String getMaTruong(){
        return maTruong;
    }
    
}
