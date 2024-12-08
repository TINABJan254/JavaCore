package bai12;

public class TheLoai {
    private String tenTheLoai, maTheLoai;
    
    public TheLoai(String maTheLoai, String tenTheLoai){
        this.maTheLoai = maTheLoai;
        this.tenTheLoai = tenTheLoai;
    }
    
    public String getMaTheLoai(){
        return this.maTheLoai;
    }
    
    @Override
    public String toString(){
        return this.tenTheLoai;
    }
    
}
