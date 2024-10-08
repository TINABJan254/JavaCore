package thuc_hanh1.bao_cao_ttcs;

public class SinhVien {
    
    private String id, ten, email, sdt;
    
    public SinhVien(String id, String ten, String sdt, String email){
        this.id = id;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return id + " " + ten;
    }
}
