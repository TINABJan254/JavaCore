package string;

import java.math.BigInteger;
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

public class GhepXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] a = new String[n + 5];
        for (int i = 0; i < n; i++){
            a[i] = sc.next();
        }
        
        Arrays.sort(a, 0, n, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                String xy = o1 + o2;
                String yx = o2 + o1;
                if (xy.compareTo(yx) == -1)
                    return 1;
                return -1;
            }
        });
        
        for (int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
        
    }
}
