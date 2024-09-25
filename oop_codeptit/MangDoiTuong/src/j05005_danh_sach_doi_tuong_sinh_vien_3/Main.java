package j05005_danh_sach_doi_tuong_sinh_vien_3;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (o1.getGpa() > o2.getGpa()){
                    return -1;
                }
                return 1;
            }
        });
        
        for (SinhVien x : a){
            System.out.println(x);
        }
    }
}
