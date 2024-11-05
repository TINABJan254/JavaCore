package j06002_sap_xep_hoa_don_ban_quan_ao;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            listSanPham.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++){
            String maHD = sc.next();
            long soLuong = sc.nextLong();
            String maSP = "" + maHD.charAt(0) + maHD.charAt(1);
            SanPham sanPham = null;
            for (SanPham sp : listSanPham){
                if (sp.getMaLoai().equals(maSP)){
                    sanPham = sp;
                }
            }
            listHoaDon.add(new HoaDon(String.format("%s-%03d", maHD, i), sanPham, soLuong));
        }
        
        Collections.sort(listHoaDon, new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2){
                return (int)(o2.phaiTra() - o1.phaiTra());
            }
        });
        
        for (HoaDon hoaDon : listHoaDon){
            System.out.println(hoaDon);
        }
        
    }
}
