package j05027_tim_kiem_giang_vien;

public class GiangVien {
    private String id, hoTen, boMon;

    public GiangVien(int id, String hoTen, String boMon) {
        this.id = String.format("GV%02d", id);
        this.hoTen = hoTen;
        this.boMon = boMon;
    }
    
    public String getId(){
        return id;
    }

    public String getBoMon(){
        return boMon;
    }
        
    public String getMaBoMon() {
        String tmp = boMon;
        String res = "";
        tmp = " " + tmp;
        for (int i = 1; i < tmp.length(); i++) {
            if (tmp.charAt(i - 1) == ' ') {
                res += Character.toUpperCase(tmp.charAt(i));
            }
        }
        return res;
    }
    
    public String getHoTen(){
        return hoTen;
    }
    
    public String getTen(){
        int i = hoTen.length() - 1;
        while (hoTen.charAt(i) != ' '){
            --i;
        }
        return hoTen.substring(i);
    }
    
    @Override
    public String toString(){
        return id + " " + hoTen + " " + getMaBoMon();
    }
}
