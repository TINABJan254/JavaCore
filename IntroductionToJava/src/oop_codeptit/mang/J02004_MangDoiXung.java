package oop_codeptit.mang;

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

public class J02004_MangDoiXung {
    
    public static boolean check(int[] a){
        int L = 0, R = a.length - 1;
        while (L <= R){
            if (a[L] != a[R]){
                return false;
            }
            ++L; --R;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            if (check(a)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
