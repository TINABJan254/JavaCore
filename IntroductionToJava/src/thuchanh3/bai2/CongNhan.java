package thuchanh3.bai2;

public class CongNhan {
    private String maCN, ten, gioVao, gioRa;
    
    public CongNhan(String maCN, String ten, String gioVao, String gioRa){
        this.maCN = maCN;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    
    public String getMaCN(){
        return this.maCN;
    }
    
    public int gioLam(){
        int h = Integer.parseInt(gioRa.substring(0, 2)) - Integer.parseInt(gioVao.substring(0, 2));
        int m = Integer.parseInt(gioRa.substring(3)) - Integer.parseInt(gioVao.substring(3));
        if (m < 0){
            --h;
            m += 60;
        }
        return h-1;
    }
    
    public int phutLam(){
        int m = Integer.parseInt(gioRa.substring(3)) - Integer.parseInt(gioVao.substring(3));
        if (m < 0){
            m += 60;
        }
        return m;
    }
    
    public String trangThai(){
        if (gioLam() >= 8){
            return "DU";
        }
        return "THIEU";
    }
    
    @Override
    public String toString(){
        return maCN + " " + ten + " " + gioLam() + " gio " + phutLam() + " phut " + trangThai();
    }    
    
}
