package j07037_danh_sach_doanh_nghiep;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DN.in"));
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<DoanhNghiep>(){
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2){
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (DoanhNghiep x : a){
            System.out.println(x);
        }
    }
}
