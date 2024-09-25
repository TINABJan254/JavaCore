package j05011_tinh_gio;

public class GameThu {
    private String id, ten, gioVao, gioRa;
    
    public GameThu(String id, String ten, String gioVao, String gioRa){
        this.id = id;
        this.ten = ten;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
    }
    
    public int getGioChoi(){
        int h = Integer.parseInt(gioRa.substring(0, 2)) - Integer.parseInt(gioVao.substring(0, 2));
        int m = Integer.parseInt(gioRa.substring(3)) - Integer.parseInt(gioVao.substring(3));
        if (m < 0){
            --h;
            m += 60;
        }
        return h;
    }
    
    public int getPhutChoi(){
        int m = Integer.parseInt(gioRa.substring(3)) - Integer.parseInt(gioVao.substring(3));
        if (m < 0){
            m += 60;
        }
        return m;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + getGioChoi() + " gio " + 
                getPhutChoi() + " phut";
    }
}
