package j07007_liet_ke_cac_tu_khac_nhau;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class J07007 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ts = new TreeSet<>();
        while(sc.hasNext()){
            ts.add(sc.next().toLowerCase());
        }
        
        for (String x : ts){
            System.out.println(x);
        }
        
    }
}
