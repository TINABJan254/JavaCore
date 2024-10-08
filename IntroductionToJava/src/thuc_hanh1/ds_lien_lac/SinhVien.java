package thuc_hanh1.ds_lien_lac;

public class SinhVien {
    private String id, ten, lop, email, sdt;
    
    public SinhVien(String id, String ten, String lop, String email, String sdt){
        this.id = id;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.sdt = "0" + sdt;
    }

    public String getId() {
        return id;
    }

    public String getLop() {
        return lop;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + email + " " + sdt;
    }
}
