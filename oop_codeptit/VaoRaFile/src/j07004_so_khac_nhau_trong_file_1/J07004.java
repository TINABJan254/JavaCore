package j07004_so_khac_nhau_trong_file_1;

import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int[] d = new int[1005];
        for (int i = 0; i < 1005; i++){
            d[i] = 0;
        }
        
        while (sc.hasNext()){
            d[sc.nextInt()]++;
        }
        
        for (int i = 0; i <= 1001; i++){
            if (d[i] != 0){
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
