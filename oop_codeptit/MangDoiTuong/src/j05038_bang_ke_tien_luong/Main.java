package j05038_bang_ke_tien_luong;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLong(), sc.nextLong(), sc.next());
            a.add(x);
        }
        
        long res = 0;
        for (NhanVien x : a){
            System.out.println(x);
            res += x.thucLinh();
        }
        System.out.print("Tong chi phi tien luong: " + res);
    }
}
