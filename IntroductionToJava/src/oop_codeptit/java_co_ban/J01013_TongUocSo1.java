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

public class J01013_TongUocSo1 {

    public static int[] p;

    public static void sieve() {
        for (int i = 1; i <= 2000000; i++) {
            p[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(2000000); i++){
            if (p[i] == i){
                for (int j = i * i; j <= 2000000; j += i){
                    if (p[j] == j){
                        p[j] = i;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p = new int[2000005];
        sieve();

        int t = sc.nextInt();
        long res = 0;
        while (t-- != 0) {
            int n = sc.nextInt();
            while (n != 1){
                res += p[n];
                n /= p[n];
            }
        }
        System.out.println(res);
    }
}
