package j05027_tim_kiem_giang_vien;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            GiangVien x = new GiangVien(i, sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0){
            String tuKhoa = sc.next();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + tuKhoa + ":");
            for (GiangVien x : a){
                String hoTen = x.getHoTen().toLowerCase();
                if (hoTen.contains(tuKhoa.toLowerCase())){
                    System.out.println(x);
                }
            }
        }
    }
}
