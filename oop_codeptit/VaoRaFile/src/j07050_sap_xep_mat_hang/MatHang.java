package j07050_sap_xep_mat_hang;

public class MatHang {
    private String maMH, tenMH, nhomHang;
    private double giaMua, giaBan;
    
    public MatHang(int id, String tenMH, String nhomHang, double giaMua, double giaBan){
        this.maMH = String.format("MH%02d", id);
        this.tenMH = tenMH;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public double loiNhuan(){
        return giaBan - giaMua;
    }
    
    @Override
    public String toString(){
        return maMH + " " + tenMH + " " + nhomHang + " " + String.format("%.2f", loiNhuan());
    }
    
}
