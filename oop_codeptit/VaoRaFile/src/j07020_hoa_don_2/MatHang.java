package j07020_hoa_don_2;

public class MatHang {
    private String maMH, tenMH, donVi;
    private int giaMua, giaBan;

    public MatHang(String maMH, String tenMH, String donVi, int giaMua, int giaBan) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public String getMaMH(){
        return this.maMH;
    }
    
    public int getGiaBan(){
        return this.giaBan;
    }
    
    @Override
    public String toString(){
        return tenMH + " " + donVi + " " + giaMua + " " + giaBan;
    }
}
