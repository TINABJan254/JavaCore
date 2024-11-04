package thuchanh2.bai13;

public class SinhVien {
    
    private String id, ten, email, sdt;
    private DeTai deTai;
    private HoiDong hoiDong;
    
    public SinhVien(String id, String ten, String sdt, String email){
        this.id = id;
        this.ten = ten;
        this.email = email;
        this.sdt = sdt;
    }
    
    public void setDeTai(DeTai deTai){
        this.deTai = deTai;
    }
    
    public void setHoiDong(HoiDong hoiDong){
        this.hoiDong = hoiDong;
    }

    public String getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return id + " " + ten;
    }
}
