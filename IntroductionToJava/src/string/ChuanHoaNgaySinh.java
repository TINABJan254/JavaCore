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

public class ChuanHoaNgaySinh {
    
    public static String ChuanHoa_split(String s){
        String res = "";
        String[] a = s.split("/");
        res += String.format("%02d", Integer.parseInt(a[0])) + '/';
        res += String.format("%02d", Integer.parseInt(a[1])) + '/';
        res += a[2];
        return res;
    }
    
    public static String ChuanHoa_stringBuilder(String s){
        StringBuilder res = new StringBuilder(s);
        if (res.charAt(2) != '/')
            res.insert(0, '0');
        if (res.charAt(5) != '/')
            res.insert(3, '0');
        return res.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = ChuanHoa_stringBuilder(s);
        String s2 = ChuanHoa_split(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}