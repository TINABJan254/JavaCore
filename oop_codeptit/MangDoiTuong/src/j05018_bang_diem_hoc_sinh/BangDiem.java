package j05018_bang_diem_hoc_sinh;

public class BangDiem {
    private String id, ten;
    private double[] diem = new double[10];
    
    public BangDiem(int id, String ten, double[] diem){
        this.id = "HS" + String.format("%02d", id);
        this.ten = ten;
        for (int i = 0; i < diem.length; i++){
            this.diem[i] = diem[i];
        }
    }
    
    public String getId(){
        return this.id;
    }
    
    public double diemTB(){
        double res = 0;
        res += this.diem[0] * 2 + this.diem[1] * 2;
        for (int i = 2; i < 10; i++){
            res += this.diem[i];
        }
        return res / 12;
    }
    
    public String xepLoai(){
        double tb = diemTB();
        if (tb >= 9.0){
            return "XUAT SAC";
        }
        else if (tb >= 8.0){
            return "GIOI";
        }
        else if (tb >= 7.0) {
            return "KHA";
        }
        else if (tb >= 5.0){
            return "TB";
        }
        return "YEU";
    }
        
    
    @Override
    public String toString(){
        return id + " " + ten + " " + String.format("%.1f", (double)Math.round(diemTB() * 10) / 10) + " " + xepLoai();
    }
    
}
