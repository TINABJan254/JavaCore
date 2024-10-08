package j07010_danh_sach_sinh_vien_trong_file_2;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.next(), sc.next(), sc.nextDouble());
            System.out.println(x);
        }
    }
}
