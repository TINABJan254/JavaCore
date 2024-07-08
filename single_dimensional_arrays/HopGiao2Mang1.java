package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HopGiao2Mang1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> hop  = new TreeSet<>();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            set1.add(x);
            hop.add(x);
        }
        
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            set2.add(x);
            hop.add(x);
        }
        
        //Giao
        for (int x : set1){
            if (set2.contains(x))
                System.out.print(x + " ");
        }
        System.out.println("");
        
        //Hop
        for (int x : hop)
            System.out.print(x + " ");
    }
}
