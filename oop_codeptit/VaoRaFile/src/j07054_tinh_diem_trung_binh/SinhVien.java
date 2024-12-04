package j07054_tinh_diem_trung_binh;

public class SinhVien {
    private String maSV, ten;
    private int diem1, diem2, diem3;
    
    public SinhVien(String maSV, String ten, int diem1, int diem2, int diem3){
        this.maSV = maSV;
        this.ten = chuanHoa(ten);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }
    
    private String chuanHoa(String s){
        String[] a = s.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : a){
            res.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++){
                res.append(x.charAt(i));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    public String getMaSV(){
        return this.maSV;
    }
    
    public double diemTb(){
        return (diem1 + diem2 + diem3) / 3.0;
    }
    
    
    @Override
    public String toString(){
        return maSV + " " + ten + " " + String.format("%.2f", diemTb());
    }
    
}
