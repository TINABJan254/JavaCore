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

public class J01016_ChuSo4VaChuSo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int cnt4 = 0, cnt7 = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '4'){
                ++cnt4;
            }
            else if (s.charAt(i) == '7'){
                ++cnt7;
            }
        }
        if (cnt4 + cnt7 == 4 || cnt4 + cnt7 == 7){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
