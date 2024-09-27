package j05024_liet_ke_sinh_vien_theo_nganh;

public class SinhVien {
    private String id, ten, lop, email;
    
    public SinhVien(String id, String ten, String lop, String email){
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getNganh(){
        String res = "";
        String maNganh = id.substring(3, 7);
        if (maNganh.equals("DCKT")){
            res = "Ke toan";
        }
        else if (maNganh.equals("DCVT")){
            res = "Vien thong";
        }
        else if (maNganh.equals("DCDT")){
            res = "Dien tu";
        }
        else if (maNganh.equals("DCCN") && lop.charAt(0) != 'E'){
            res = "Cong nghe thong tin";
        }
        else if (maNganh.equals("DCAT") && lop.charAt(0) != 'E'){
            res = "An toan thong tin";
        }
        return res;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
}
