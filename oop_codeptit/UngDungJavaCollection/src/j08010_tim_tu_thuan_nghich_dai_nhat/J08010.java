package j08010_tim_tu_thuan_nghich_dai_nhat;

import java.util.*;

public class J08010 {
    
    public static boolean checkTn(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return s.equals(sb.toString());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxLen = -1;
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.next();
            if (checkTn(s) && s.length() >= maxLen ){
                maxLen = s.length();
                if (hm.containsKey(s)){
                    hm.put(s, hm.get(s) + 1);
                }
                else {
                    hm.put(s, 1);
                    a.add(s);
                }
            }
        }
        
        for (String x : a){
            if (x.length() == maxLen){
                System.out.println(x + " " + hm.get(x));
            }
        }
    }
}
