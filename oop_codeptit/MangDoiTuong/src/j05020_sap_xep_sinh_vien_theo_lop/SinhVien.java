package j05020_sap_xep_sinh_vien_theo_lop;

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
