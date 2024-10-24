package j05044_liet_ke_nhan_vien_theo_chuc_vu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        
        String chucVu = sc.next();
        
        
        for (NhanVien x : a){
            if (x.getChucVu().equals(chucVu)){
                System.out.println(x);
            }
        }
    }
}
