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

public class J01014_UocSNTLonNhat {
    
    public static long maxPrimeFactor(long n){
        long res = -1;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                res = i;
                while (n % i == 0){
                    n /= i;
                }
            }
        }
        if (n > 1)
            res = n;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            long n = sc.nextLong();
            System.out.println(maxPrimeFactor(n));
        }
    }
}
