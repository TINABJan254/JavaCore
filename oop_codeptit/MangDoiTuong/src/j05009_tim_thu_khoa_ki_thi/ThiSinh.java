package j05009_tim_thu_khoa_ki_thi;

public class ThiSinh {
    private String id, ten, nsinh;
    private double diem1, diem2, diem3;
    
    public ThiSinh(int id, String ten, String nsinh, double diem1, double diem2, double diem3){
        this.id = id + "";
        this.ten = ten;
        this.nsinh = nsinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    public double tongDiem(){
        return diem1 + diem2 + diem3;
    }
    
    public String getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + nsinh + " " + String.format("%.1f", tongDiem());
    }
}
