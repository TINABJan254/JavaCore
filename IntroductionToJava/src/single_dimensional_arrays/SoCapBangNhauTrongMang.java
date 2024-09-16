package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SoCapBangNhauTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (map.containsKey(x)){
                int fre = map.get(x);
                map.put(x, fre + 1);
            }
            else{
                map.put(x, 1);
            }
        }
        
        long res = 0;
        Set<Map.Entry<Integer, Integer>> entryS = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entryS){
            int tmp = entry.getValue();
            res += (tmp * (tmp - 1)) / 2;
        }
        
        System.out.print(res);
    }
}
