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

public class J01012_UocSoChiaHetCho2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            int n = sc.nextInt();
            long res = 0;
            for (int i = 1; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    if (i % 2 == 0){
                        ++res;
                    }
                    if ( i != (n / i) && ((n / i) % 2 == 0))
                        ++res;
                }
            }
            System.out.println(res);
        }
    }
}
