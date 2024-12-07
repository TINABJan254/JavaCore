package j07081_sap_xep_danh_sach_sinh_vien;

public class SinhVien {
    private String maSV, hoTen, sdt, email;
    
    public SinhVien(String maSV, String hoTen, String sdt, String email){
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.email = email;
    }
    
    public String getMaSV(){
        return this.maSV;
    }
    
    public String ten(){
        String[] a = hoTen.split("\\s+");
        return a[a.length - 1];
    }
    
    public String ho(){
        String[] a = hoTen.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length - 1; i++){
            res.append(a[i]);
        }
        return res.toString();
    }
    
    @Override
    public String toString(){
        return maSV + " " + hoTen + " " + sdt + " " + email;
    }
    
}
