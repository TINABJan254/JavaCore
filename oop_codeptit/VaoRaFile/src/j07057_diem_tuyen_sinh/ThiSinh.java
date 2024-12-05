package j07057_diem_tuyen_sinh;

public class ThiSinh {
    private String maTs, ten;
    private double diemThi;
    private String danToc;
    
    private int khuVuc;
    
    public ThiSinh(String maTs, String ten, double diemThi, String danToc, int khuVuc) {
        this.maTs = maTs;
        this.ten = chuanHoa(ten);
        this.diemThi = diemThi;
        this.khuVuc = khuVuc;
        this.danToc = danToc;
    }
    
    public String chuanHoa(String s){
        String[] a = s.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : a){
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    
    public String getMaTs(){
        return this.maTs;
    }
    
    public double diemKv(){
        if (khuVuc == 1){
            return 1.5;
        }
        if (khuVuc == 2){
            return 1.0;
        }
        return 0;
    }
    
    public double diemDT(){
        if (!danToc.equals("Kinh")){
            return 1.5;
        }
        return 0;
    }
    
    public double tongDiem(){
        return diemThi + diemKv() + diemDT();
    }
    
    public String trangThai(){
        if (tongDiem() >= 20.5){
            return "Do";
        }
        return "Truot";
    }
    
    @Override
    public String toString(){
        return maTs + " " + ten + " " + String.format("%.1f", tongDiem()) + " " + trangThai();
    }
}
