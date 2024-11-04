package j06004_quan_ly_bai_tap_nhom_2;

public class Nhom {

    private int id;
    private String deTai;

    public Nhom(int id, String deTai) {
        this.id = id;
        this.deTai = deTai;
    }
    
    public String getDeTai(){
        return this.deTai;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setDeTai(String deTai){
        this.deTai = deTai;
    }
    
    @Override
    public String toString(){
        return id + " " + deTai;
    }
}
