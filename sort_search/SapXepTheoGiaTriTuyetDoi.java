package sort_search;

import java.util.ArrayList;
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

public class SapXepTheoGiaTriTuyetDoi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = sc.nextInt();
        int x = sc.nextInt();
        for (int i = 0; i < n; i++){
            int tmp = sc.nextInt();
            arr.add(tmp);
        }
        
        arr.sort(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if (Math.abs(o1 - x) != Math.abs(o2 - x))
                    return Math.abs(o1 - x) - Math.abs(o2 - x);
                return o1 - o2;
            }
        });
        
        arr.forEach((tmp) -> System.out.print(tmp + " "));
    }
}
