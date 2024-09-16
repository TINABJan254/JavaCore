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

public class J01008_PhanTichThuaSoNguyenTo {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for (int i = 1; i <= t; i++){
           int n = sc.nextInt();
           System.out.print("Test " + i + ": ");
           for (int j = 2; j <= Math.sqrt(n); j++){
               if (n % j == 0){
                   int cnt = 0;
                   while (n % j == 0){
                       ++cnt;
                       n /= j;
                   }
                   System.out.printf("%d(%d) ", j, cnt);
                   if (n == 1)
                       System.out.println("");
               }
           }
           if (n > 1){
               System.out.printf("%d(%d)\n", n, 1);
           }
       }
    }
}
