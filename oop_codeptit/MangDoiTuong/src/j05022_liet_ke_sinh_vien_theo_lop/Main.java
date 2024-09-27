package j05022_liet_ke_sinh_vien_theo_lop;

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
        while (q-- > 0){
            String lop = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (SinhVien x : a){
                if (x.getLop().equals(lop)){
                    System.out.println(x);
                }
            }
        }
    }
}
