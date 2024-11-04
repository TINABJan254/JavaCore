package thuchanh2.bai4;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        
        for (int i = 0; i < n; i++){
            sc.nextLine();
            SinhVien sinhVien = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            dsSV.add(sinhVien);
        }
        
        Collections.sort(dsSV, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (o1.getAC() != o2.getAC()){
                    return o2.getAC() - o1.getAC();
                }
                else if (o1.getSub() != o2.getSub()){
                    return o1.getSub() - o2.getSub();
                }
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for (SinhVien sinhVien : dsSV){
            System.out.println(sinhVien);
        }
        
    }
}
