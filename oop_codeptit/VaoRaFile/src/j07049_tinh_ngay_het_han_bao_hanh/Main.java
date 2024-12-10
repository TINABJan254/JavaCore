package j07049_tinh_ngay_het_han_bao_hanh;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = sc.nextInt();
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            listSanPham.add(new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextInt()));
        }
        
        int m = sc.nextInt();
        sc.nextLine();
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        for (int i = 0; i < m; i++){
            String tenKH = sc.nextLine();
            String diaChi = sc.nextLine();
            String maSP = sc.nextLine();
            int soluong = sc.nextInt(); sc.nextLine();
            String ngayMua = sc.nextLine();
            
            SanPham sanPham = null;
            for (SanPham sp : listSanPham){
                if (sp.getMaSP().equals(maSP)){
                    sanPham = sp;
                    break;
                }
            }
            
            listKhachHang.add(new KhachHang(String.format("KH%02d", i + 1), tenKH, diaChi, sanPham, soluong, ngayMua));
        }
        
        Collections.sort(listKhachHang, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2){
                return o1.hetHan().compareTo(o2.hetHan());
            }
        });
        
        for (KhachHang kh : listKhachHang){
            System.out.println(kh);
        }
    }
}
