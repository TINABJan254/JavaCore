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

public class J01018_SoKhongLienKe {
    
    public static int sumDigit(String s){
        int res = 0;
        for (int i = 0; i < s.length(); i++){
            res += (s.charAt(i) - '0');
        }
        return res;
    }
    
    public static boolean check(String s){
        for (int i = 1; i < s.length(); i++){
            if (Math.abs((s.charAt(i)) - (s.charAt(i - 1))) != 2){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0){
            String s = sc.next();
            if (sumDigit(s) % 10 == 0 && check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
