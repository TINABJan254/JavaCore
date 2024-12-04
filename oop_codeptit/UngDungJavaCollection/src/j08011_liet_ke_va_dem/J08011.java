package j08011_liet_ke_va_dem;

import java.util.*;

public class J08011 {
    
    public static boolean check(String s){
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) < s.charAt(i - 1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()){
            String s = sc.next();
            if (check(s)){
                if (hm.containsKey(s)){
                    hm.put(s, hm.get(s) + 1);
                }
                else {
                    hm.put(s, 1);
                    a.add(s);
                }
            }
        }
        
        Collections.sort(a, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return hm.get(o2) - hm.get(o1);
            }
        });
        
        for (String x : a){
            System.out.println(x + " " + hm.get(x));
        }
        
    }
}
