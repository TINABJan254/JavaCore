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

public class SapXepChuSo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> arr = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '0')
                arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        
        for (Character c : arr){
            System.out.print(c);
        }
    }
}
