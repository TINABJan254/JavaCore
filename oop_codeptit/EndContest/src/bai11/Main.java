package bai11;

import java.util.*;

public class Main {
    
    public static boolean check(String s){
        if (s.length() != 8){
            return false;
        }
        if (s.charAt(2) != ':' || s.charAt(5) != ':'){
            return false;
        }
        
        for (char c : s.toCharArray()){
            if (c != ':' && !Character.isDigit(c)){
                return false;
            }
        }
        
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        int ss = Integer.parseInt(s.substring(6));
        
        if (h > 23 || m > 59 || ss > 59){
            return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        while (sc.hasNextLine()){
            s.append(sc.nextLine());
            s.append(" ");
        }
        
        String[] li = s.toString().trim().split("[.,\\s]+");
        
        ArrayList<String> a = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        for (String tmp : li){
            if (check(tmp) && !hs.contains(tmp)){
                a.add(tmp);
                hs.add(tmp);
            }
        }
        
        Collections.sort(a);
        
        for (String x : a){
            System.out.println(x);
        }
        
    }
}