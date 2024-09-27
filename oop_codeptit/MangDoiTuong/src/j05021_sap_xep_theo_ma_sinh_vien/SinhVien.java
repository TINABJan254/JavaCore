package j05021_sap_xep_theo_ma_sinh_vien;

public class SinhVien {
    
    private String id, ten, lop, email;
    
    public SinhVien(String id, String ten, String lop, String email){
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
}
