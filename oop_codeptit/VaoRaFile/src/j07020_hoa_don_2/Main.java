package j07020_hoa_don_2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);
        
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n; i++){
            KhachHang kh = new KhachHang(String.format("KH%03d", i + 1), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            listKhachHang.add(kh);
        }
        
        ArrayList<MatHang> listMatHang = new ArrayList<>();
        int m = sc2.nextInt();
        for (int i = 0; i < m; i++){
            sc2.nextLine();
            MatHang mh = new MatHang(String.format("MH%03d", i + 1), sc2.nextLine(), sc2.nextLine(), sc2.nextInt(), sc2.nextInt());
            listMatHang.add(mh);
        }
        
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        int k = sc3.nextInt();
        for (int i = 0; i < k; i++){
            String maKH = sc3.next();
            String maMH = sc3.next();
            int soLuong = sc3.nextInt();
            
            KhachHang khachHang = null;
            MatHang matHang = null;
            
            for (KhachHang x : listKhachHang){
                if (x.getMaKH().equals(maKH)){
                    khachHang = x;
                    break;
                }
            }
            
            for (MatHang x : listMatHang){
                if (x.getMaMH().equals(maMH)){
                    matHang = x;
                    break;
                }
            }
            
            listHoaDon.add(new HoaDon(String.format("HD%03d", i + 1), khachHang, matHang, soLuong)); 
        }
        
        for (HoaDon hoaDon : listHoaDon){
            System.out.println(hoaDon);
        }
    }
}