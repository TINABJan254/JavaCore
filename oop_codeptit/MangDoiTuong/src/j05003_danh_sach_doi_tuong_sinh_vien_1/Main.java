package j05003_danh_sach_doi_tuong_sinh_vien_1;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(a);
        }
    }
}
