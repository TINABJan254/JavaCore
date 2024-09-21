package j07058_danh_sach_mon_thi;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<MonHoc> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            a.add(new MonHoc(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(a, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2){
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for (MonHoc x : a){
            System.out.println(x);
        }
        
    }
}
