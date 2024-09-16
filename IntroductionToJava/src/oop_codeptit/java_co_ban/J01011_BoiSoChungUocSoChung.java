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

public class J01011_BoiSoChungUocSoChung {
    
    public static long gcd(long a, long b){
        while (b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static long lcm(long a, long b){
        return a / gcd(a, b) * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.printf("%d %d\n", lcm(a, b), gcd(a, b));
        }
    }
}
