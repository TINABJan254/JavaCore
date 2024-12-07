package j07081_sap_xep_danh_sach_sinh_vien;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < n; i++){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSinhVien.add(sv);
        }
        
        Collections.sort(listSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (!o1.ten().equals(o2.ten())){
                    return o1.ten().compareTo(o2.ten());
                } else if (!o1.ho().equals(o2.ho())){
                    return o1.ho().compareTo(o2.ho());
                }
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        for (SinhVien sv : listSinhVien){
            System.out.println(sv);
        }
    }
}
