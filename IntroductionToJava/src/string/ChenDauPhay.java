package string;

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
import java.util.StringTokenizer;
import java.util.TreeMap;

public class ChenDauPhay {
    
    public static void solve(String s){
        String res = "";
        int cnt = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            if (cnt == 3){
                res = "," + res;
                cnt = 0;
            }
            res = s.charAt(i) + res;
            ++cnt;
        }
        System.out.println(res);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solve(s);
    }
}
