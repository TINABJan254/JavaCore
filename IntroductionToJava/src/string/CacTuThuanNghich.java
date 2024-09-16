package string;

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
import java.util.StringTokenizer;
import java.util.TreeMap;

public class CacTuThuanNghich {
        
    public static boolean check(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev_s = sb.toString();
        return s.equals(rev_s);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s+");
        TreeSet<String> se = new TreeSet<>();
        for (String x : a){
            if (check(x))
                se.add(x);
        }
        
        for (String x : se){
            System.out.print(x + " ");
        }
    }
}