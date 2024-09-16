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

public class J01010_CatDoi {

    public static char change(char c) {
        if (c == '0' || c == '8' || c == '9') {
            return '0';
        }
        if (c == '1') {
            return '1';
        }
        return 'F';
    }

    public static void catDoi(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (change(s.charAt(i)) != 'F') {
                res += change(s.charAt(i));
            } else {
                System.out.println("INVALID");
                return;
            }
        }
        long n = Long.parseLong(res);
        if (n != 0) {
            System.out.println(n);
        } else {
            System.out.println("INVALID");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            String s;
            s = sc.next();
            catDoi(s);
        }
    }
}
