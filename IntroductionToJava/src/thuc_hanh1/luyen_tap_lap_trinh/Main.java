package thuc_hanh1.luyen_tap_lap_trinh;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<SinhVien>(){
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
        
        for (SinhVien x : a){
            System.out.println(x);
        }
        
    }
}
