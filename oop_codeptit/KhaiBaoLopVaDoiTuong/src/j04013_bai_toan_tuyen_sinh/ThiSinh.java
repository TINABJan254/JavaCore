package j04013_bai_toan_tuyen_sinh;

public class ThiSinh {
    private String ma, ten;
    private double toan, ly, hoa;
    
    public ThiSinh(String ma, String ten, double toan, double ly, double hoa){
        this.ma = ma;
        this.ten = ten;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public double diemUuTien(){
        String kv = ma.substring(0, 3);
        if (kv.equals("KV1")){
            return 0.5;
        }
        else if (kv.equals("KV2")){
            return 1.0;
        }
        return 2.5;
    }
    
    public double tongDiem(){
        return toan*2 + ly + hoa;
    }
    
    public String trangThai(){
        if (tongDiem() + diemUuTien() >= 24.0){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
    
    @Override
    public String toString(){
        double ut = diemUuTien();
        double tong = tongDiem();
        String res = ma + " " + ten + " ";  

        if (ut - (int)ut != 0){
            res += String.format("%.1f ", ut);
        }
        else{
            res += String.format("%.0f ", ut);
        }
        
        if (tong - (int)tong != 0){
            res += String.format("%.1f ", tong);
        }
        else{
            res += String.format("%.0f ", tong);
        }
        
        res += trangThai();
        
        return res;
    }
    
}
