package j07025_danh_sach_khach_hang_trong_file;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
//        Scanner sc = new Scanner(System.in);
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            KhachHang kh = new KhachHang(String.format("KH%03d", i + 1), sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listKhachHang.add(kh);
        }
        
        Collections.sort(listKhachHang, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2){
                return o1.getNgaySinh().compareTo(o2.getNgaySinh());
            }
        });
        
        for (KhachHang khachHang : listKhachHang){
            System.out.println(khachHang);
        }   
    }
}