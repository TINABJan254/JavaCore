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

public class DemSoLuongCapSoBangNhau{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        HashMap<Integer, Long> mp = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (mp.containsKey(x)){
                mp.put(x, mp.get(x) + 1);
            }
            else{
                mp.put(x, 1L);
            }
        }
        
        Set<Map.Entry<Integer, Long>> ens = mp.entrySet();
        long res = 0;
        for (Map.Entry<Integer, Long> entry : ens){
            res += (entry.getValue() * (entry.getValue() - 1) ) / 2;
        }
        System.out.println(res);
    }
}
