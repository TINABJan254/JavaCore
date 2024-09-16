package sort_search;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class B1_Comparator {
    
    public static int check(int n){
        int cnt = 0;
        while (n != 0){
            int r = n % 10;
            if (r % 2 == 0)
                ++cnt;
            n /= 10;
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a, 0, n, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                if (check(o1) != check(o2))
                    return check(o1) - check(o2);
                return o1 - o2;
            }
        });
        
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, n)));
    }
    
}
