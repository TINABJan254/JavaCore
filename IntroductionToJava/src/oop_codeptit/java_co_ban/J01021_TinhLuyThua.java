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

public class J01021_TinhLuyThua {
    
    public static long MOD = (long)(1e9 + 7);
    
    public static long powMod(long a, long b){
        long res = 1;
        while (b != 0){
            if (b % 2 != 0){
                res *= a;
                res %= MOD;
            }
            a *= a;
            a %= MOD;
            b /= 2;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            long a, b;
            a = sc.nextLong();
            b = sc.nextLong();
            if (a == 0 && b == 0){
                break;
            }
            System.out.println(powMod(a, b));
        }
    }
}
