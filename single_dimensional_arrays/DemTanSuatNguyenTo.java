package single_dimensional_arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DemTanSuatNguyenTo{
     
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        Map<Integer, Integer> mp = new LinkedHashMap<>();
        while(sc.hasNext()){
            int x = sc.nextInt();
                if (isPrime(x)){
                    if (mp.containsKey(x)){
                    mp.put(x, mp.get(x) + 1);
                }
                else{
                    mp.put(x, 1);
                }
            }
        }
        
        Set<Map.Entry<Integer, Integer>> es = mp.entrySet();
        for (Map.Entry<Integer, Integer> entry : es){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
