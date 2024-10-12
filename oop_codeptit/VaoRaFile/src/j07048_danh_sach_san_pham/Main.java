package j07048_danh_sach_san_pham;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        ArrayList<SanPham> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<SanPham>(){
            @Override
            public int compare(SanPham o1, SanPham o2){
                if (o1.getGiaBan() != o2.getGiaBan()){
                    return (int)(o2.getGiaBan() - o1.getGiaBan());
                }
                return o1.getMaSP().compareTo(o2.getMaSP());
            }
        });
        
        for (SanPham x : a){
            System.out.println(x);
        }
    }
}