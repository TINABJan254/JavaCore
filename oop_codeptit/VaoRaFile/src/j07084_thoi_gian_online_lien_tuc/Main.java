package j07084_thoi_gian_online_lien_tuc;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc = new Scanner(new File("ONLINE.in"));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < n; i++){
            listSinhVien.add(new SinhVien(sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim()));
        }
        
        Collections.sort(listSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (o1.tgOnline() > o2.tgOnline()){
                    return -1;
                } else if (o1.tgOnline() < o2.tgOnline()){
                    return 1;
                }
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
        
        for (SinhVien sv : listSinhVien){
            System.out.println(sv);
        }
        
    }
}