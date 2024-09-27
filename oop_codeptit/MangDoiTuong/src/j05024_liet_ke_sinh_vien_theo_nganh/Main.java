package j05024_liet_ke_sinh_vien_theo_nganh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0){
            String nganh = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh.toUpperCase() + ":");
            for (SinhVien x : a){
                if (x.getNganh().equals(nganh)){
                    System.out.println(x);
                }
            }
        }
    }
}
