package j04005_khai_bao_lop_thi_sinh;

public class ThiSinh {
    private String ten, nsinh;
    private double diem1, diem2, diem3;
    
    public ThiSinh(String ten, String nsinh, double diem1, double diem2, double diem3){
        this.ten = ten;
        this.nsinh = nsinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    public String toString(){
        return ten + " " + nsinh + " " + String.format("%.1f", diem1 + diem2 + diem3);
    }
    
}
