package thuchanh2.bai9;

public class DoiThi {
    private String id, tenDoi;
    private DaiHoc daiHoc;
    
    public DoiThi(String tenDoi, DaiHoc daiHoc){
        this.tenDoi = tenDoi;
        this.daiHoc = daiHoc;
    }
    
    public String getTenDoi(){
        return tenDoi;
    }
    
    public DaiHoc getDaiHoc(){
        return daiHoc;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return id + " " + tenDoi + " " + daiHoc.getTenTruong();
    }
}
