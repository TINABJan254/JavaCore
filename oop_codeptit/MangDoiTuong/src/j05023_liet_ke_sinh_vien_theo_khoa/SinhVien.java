package j05023_liet_ke_sinh_vien_theo_khoa;

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
    
    public String khoaHoc(){
        return lop.substring(1, 3);
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + email;
    }
}
