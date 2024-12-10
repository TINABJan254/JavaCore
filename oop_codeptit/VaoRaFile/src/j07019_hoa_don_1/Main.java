package j07019_hoa_don_1;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("DATA1.in"));
        Scanner sc2 = new Scanner(new File("DATA2.in"));
        
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
        
        int n = sc1.nextInt();
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc1.nextLine();
            listSanPham.add(new SanPham(sc1.nextLine(), sc1.nextLine(), sc1.nextLong(), sc1.nextLong()));
        }
        
        ArrayList<HoaDon> listHoaDon = new ArrayList<>();
        int m = sc2.nextInt();
        for (int i = 0; i < m; i++){
            String maHD = sc2.next();
            int soLuong = sc2.nextInt();
            SanPham sanPham =  null;
            for (SanPham sp : listSanPham){
                if (sp.getMaSP().equals(maHD.substring(0, 2))){
                    sanPham = sp;
                    break;
                }
            }
            listHoaDon.add(new HoaDon(maHD + String.format("-%03d", i + 1), sanPham, soLuong));
        }
        
        for (HoaDon hd : listHoaDon){
            System.out.println(hd);
        }
        
    }
}