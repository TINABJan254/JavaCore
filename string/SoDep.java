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

public class SoDep {
    
    public static boolean check(String s){
        for (int i = 0; i < s.length() - 1; i++)
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1)
                return false;
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (check(s))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
