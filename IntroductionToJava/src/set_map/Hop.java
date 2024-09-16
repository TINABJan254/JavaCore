package set_map;

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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tse = new TreeSet<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            tse.add(x);
        }
        for (int i = 0; i < m; i++){
            int x = sc.nextInt();
            tse.add(x);
        }
        Iterator<Integer> it = tse.descendingIterator();
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}
/*
Union, duyet tu cuoi ve
*/