package luyen_tap_1.ban_hang;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc1 = new Scanner(new File("KH.in"));
        Scanner sc2 = new Scanner(new File("MH.in"));
        Scanner sc3 = new Scanner(new File("HD.in"));
        
        ArrayList<KhachHang> a = new ArrayList<>();
        ArrayList<MatHang> b = new ArrayList<>();
        ArrayList<HoaDon> c = new ArrayList<>();
        
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 1; i <= n; i++){
            a.add(new KhachHang(i, sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        
        int m = sc2.nextInt();
        for (int i = 1; i <= m; i++){
            sc2.nextLine();
            b.add(new MatHang(i, sc2.nextLine(), sc2.nextLine(), sc2.nextLong(), sc2.nextLong()));
        }
        
        int k = sc3.nextInt();
        for (int i = 1; i <= k; i++){
            String maKH = sc3.next();
            String maMH = sc3.next();
            int soLuong = sc3.nextInt();
            KhachHang khachHang = null;
            MatHang matHang = null;
            
            for (KhachHang x : a){
                if (x.getMaKH().equals(maKH)){
                    khachHang = x;
                }
            }
            
            for (MatHang x : b){
                if (x.getMaMH().equals(maMH)){
                    matHang = x;
                }
            }
                
            c.add(new HoaDon(i, khachHang, matHang, soLuong));
        }
        
        for (HoaDon x : c){
            System.out.println(x);
        }
    }
}
