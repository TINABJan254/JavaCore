package j05006_danh_sach_doi_tuong_nhan_vien;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        
        for (NhanVien x : a){
            System.out.println(x);
        }
    }
 
}
