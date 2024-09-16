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

public class J01006_TinhSoFibonaci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] F = new long[100];
        F[0] = 0;
        F[1] = 1;
        F[2] = 1;
        for (int i = 3; i <= 92; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            System.out.println(F[n]);
        }
    }
}
