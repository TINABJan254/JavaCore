package j07051_tinh_tien_phong;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            KhachHang kh = new KhachHang(String.format("KH%02d", i + 1), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine(), sc.nextLine(), sc.nextLong());
            listKhachHang.add(kh);
        }
        
        Collections.sort(listKhachHang, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2){
                if (o1.thanhTien() > o2.thanhTien()){
                    return -1;
                }
                return 1;
            }
        });
        
        for (KhachHang kh : listKhachHang){
            System.out.println(kh);
        }
    }
}