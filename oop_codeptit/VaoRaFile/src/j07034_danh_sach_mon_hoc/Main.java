package j07034_danh_sach_mon_hoc;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList<MonHoc> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            MonHoc x = new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextInt());   
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2){
                return o1.getTen().compareTo(o2.getTen());
            }
        });
        
        for (MonHoc x : a){
            System.out.println(x);
        }
        
    }
}
