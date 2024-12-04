package j07053_xet_tuyen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThiSinh {
    private String maTs, ten;
    private Date ngaySinh;
    private double diemLyThuyet, diemThucHanh;
    
    public ThiSinh(String maTs, String ten, String ngaySinh, double diemLyThuyet, double diemThucHanh) throws ParseException{
        this.maTs = maTs;
        this.ten = chuanHoa(ten);
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
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
    
    public int tuoi(){
        String year = (new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)).substring(6);
        return 2021 - Integer.parseInt(year);
    }
    
    public double diemThuong(){
        if (diemLyThuyet >= 8.0 && diemThucHanh >= 8.0){
            return 1.0;
        }
        if (diemLyThuyet >= 7.5 && diemThucHanh >= 7.5){
            return 0.5;
        }
        return 0;
    }
    
    public int diemTB(){
        return (int)(Math.round((diemLyThuyet + diemThucHanh) / 2.0 + diemThuong()));
        
    }
    
    public String xepLoai(){
        int tb = diemTB();
        if (tb < 5){
            return "Truot";
        }
        if (tb <= 6){
            return "Trung binh";
        }
        if (tb == 7){
            return "Kha";
        }
        if (tb == 8){
            return "Gioi";
        }
        return "Xuat sac";
    }
    
            
    @Override
    public String toString(){
        return maTs + " " + ten + " " + tuoi() + " " + Math.min(10, diemTB()) + " " + xepLoai(); 
    }
}
