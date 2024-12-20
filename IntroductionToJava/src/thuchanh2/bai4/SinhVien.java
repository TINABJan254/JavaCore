package thuchanh2.bai4;

public class SinhVien {
    private String ten;
    private int AC, sub;
    
    public SinhVien(String ten, int AC, int sub){
        this.ten = ten;
        this.AC = AC;
        this.sub = sub;
    }

    public String getTen() {
        return ten;
    }

    public int getAC() {
        return AC;
    }

    public int getSub() {
        return sub;
    }
    
    @Override
    public String toString(){
        return ten + " " + AC + " " + sub;
    }
}
