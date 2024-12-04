package j07052_danh_sach_trung_tuyen;

public class ThiSinh {
    private String maTs, ten;
    private double toan, ly, hoa;
    
    public ThiSinh(String maTs, String ten, double toan, double ly, double hoa){
        this.maTs = maTs;
        this.ten = chuanHoa(ten);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    private String chuanHoa(String s){
        s = s.toLowerCase();
        String[] a = s.split("\\s+");
        StringBuilder res =  new StringBuilder();
        for (String x : a){
            res.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++){
                res.append(x.charAt(i));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
    
    public String getMaTs(){
        return this.maTs;
    }
    
    public double diemUuTien(){
        String kv = this.maTs.substring(0, 3);
        if (kv.equals("KV1")){
            return 0.5;
        } else if (kv.equals("KV2")){
            return 1.0;
        }
        return 2.5;
    }
    
    public double diemXetTuyen(){
        return toan * 2 + ly + hoa + diemUuTien();
    }
    
    public String ketQua(double diemChuan){
        if (diemXetTuyen() >= diemChuan){
            return "TRUNG TUYEN";
        }
        return "TRUOT";
    }
    
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(maTs).append(" ").append(ten).append(" ");
        if ((int)(diemUuTien() * 10) % 10 != 0){
            res.append(String.format("%.1f", diemUuTien())).append(" ");
        } else {
            res.append(String.format("%.0f", diemUuTien())).append(" ");
        }
        
        if ((int)(diemXetTuyen() * 10) % 10 != 0){
            res.append(String.format("%.1f", diemXetTuyen())).append(" ");
        } else {
            res.append(String.format("%.0f", diemXetTuyen())).append(" ");
        }
        
        return res.toString().trim();
    }
    
}
