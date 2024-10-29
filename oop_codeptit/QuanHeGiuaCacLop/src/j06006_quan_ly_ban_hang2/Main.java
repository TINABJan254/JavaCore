package j06006_quan_ly_ban_hang2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        ArrayList<MatHang> listMatHang = new ArrayList<>();
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++){
            listKhachHang.add(new KhachHang(String.format("KH%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++){
            sc.nextLine();
            listMatHang.add(new MatHang(String.format("MH%03d", i), sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++){
            String maHD = String.format("HD%03d", i);
            String maKH = sc.next();
            String maMH = sc.next();
            int soLuong = sc.nextInt();
            KhachHang khachHang = null;
            MatHang matHang = null;
            
            for (KhachHang kh : listKhachHang){
                if (kh.getMaKH().equals(maKH)){
                    khachHang = kh;
                    break;
                }
            }
            
            for (MatHang mh : listMatHang){
                if (mh.getMaMH().equals(maMH)){
                    matHang = mh;
                    break;
                }
            }
            
            listHoaDon.add(new HoaDon(maHD, khachHang, matHang, soLuong));
        }
        
        Collections.sort(listHoaDon, new Comparator<HoaDon>(){
            @Override
            public int compare(HoaDon o1, HoaDon o2){
                return o2.loiNhuan() - o1.loiNhuan();
            }
        });
        
        for (HoaDon hd : listHoaDon){
            System.out.println(hd);
        }
    }
}
