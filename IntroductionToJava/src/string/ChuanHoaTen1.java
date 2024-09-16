package string;

import java.util.AbstractMap;
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

public class ChuanHoaTen1 {
    
    public static String ChuanHoaTen(String s){
        String res = "";
        String[] a = s.split("\\s+");
        for (String x : a){
            res += Character.toUpperCase(x.charAt(0));
            for (int i = 1; i < x.length(); i++)
                res += Character.toLowerCase(x.charAt(i));
            res += " ";
        }
        res = res.trim();
        return res;
    }
    
    public static String ChuanHoaTen_StringBuilder(String s){
        StringBuilder res = new StringBuilder("");
        String[] a = s.split("\\s+");
        for (String x : a){
            res.append(Character.toUpperCase(x.charAt(0)));
            for (int i = 1; i < x.length(); i++){
                res.append(x.charAt(i));
            }
            res.append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
    
    public static String ChuanHoaNgaySinh(String s){
        String res = "";
        String[] a = s.split("/");
        res += String.format("%02d", Integer.parseInt(a[0])) + "/";
        res += String.format("%02d", Integer.parseInt(a[1])) + "/";
        res += a[2];
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String birth = sc.next();
        
        name = ChuanHoaTen(name);
        name = ChuanHoaTen_StringBuilder(name);
        birth = ChuanHoaNgaySinh(birth);
        
        System.out.println(name);
        System.out.println(birth);
    }
}
