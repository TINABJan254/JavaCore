package j07056_tinh_tien_dien;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
//        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        ArrayList<KhachHang> listKhachHang = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            KhachHang kh = new KhachHang(String.format("KH%02d", i + 1), sc.nextLine().trim(), sc.next(), sc.nextInt(), sc.nextInt());
            listKhachHang.add(kh);
        }
        
        Collections.sort(listKhachHang, new Comparator<KhachHang>(){
            @Override
            public int compare(KhachHang o1, KhachHang o2){
                if (o1.tienPhaiNop() > o2.tienPhaiNop()){
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