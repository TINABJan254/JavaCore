package oop_codeptit.java_co_ban;

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

public class J01026_SoChinhPhuong {
    
    public static boolean check(int n){
        return n == Math.pow((int)(Math.sqrt(n)), 2);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            if (check(n)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }   
}
