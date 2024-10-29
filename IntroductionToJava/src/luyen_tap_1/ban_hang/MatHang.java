package luyen_tap_1.ban_hang;

public class MatHang {
    private String maMH, tenMH, donVi;
    private long giaMua, giaBan;
    
    public MatHang(int id, String tenMH, String donVi, long giaMua, long giaBan){
        this.maMH = String.format("MH%03d", id);
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public String getMaMH(){
        return maMH;
    }
    
    public long getGiaBan(){
        return giaBan;
    }
    
    @Override
    public String toString(){
        return tenMH + " " + donVi + " " + giaMua + " " + giaBan;
    }
}
