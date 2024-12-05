package j07054_tinh_diem_trung_binh;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        
        int n = sc.nextInt();
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            SinhVien sv = new SinhVien(String.format("SV%02d", i + 1), sc.nextLine().trim(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            listSinhVien.add(sv);
        }
        
        Collections.sort(listSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (o1.diemTb() > o2.diemTb()){
                    return -1;
                } else if (o1.diemTb() < o2.diemTb()){
                    return 1;
                }
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        int rank = 1;
        int num = 1;
        System.out.println(listSinhVien.get(0) + " 1");
        for (int i = 1; i < n; i++){
            if (listSinhVien.get(i).diemTb() == listSinhVien.get(i - 1).diemTb()){
                System.out.println(listSinhVien.get(i) + " " + rank);
                ++num;
            } else {
                rank += num;
                System.out.println(listSinhVien.get(i) + " " + rank);
                num = 1;
            }            
        }
        
    }
}