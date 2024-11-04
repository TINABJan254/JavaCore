package thuchanh2;

import java.util.*;
import java.io.*;

public class Bai1 {
    
    public static boolean check(int n){
        String s = n + "";
        if (s.length() < 2){
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++){
            if (s.charAt(i) > s.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream os2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> a1 = (ArrayList<Integer>) os1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) os2.readObject();
        
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        TreeSet<Integer> ts = new TreeSet<>();
        
        for (Integer x : a1){
            if (check(x)){
                ts.add(x);
                if (hm1.containsKey(x)){
                    hm1.put(x, hm1.get(x) + 1);
                } else{
                    hm1.put(x, 1);
                }
            }
        }
        
        for (Integer x : a2){
            if (check(x)){
                ts.add(x);
                if (hm2.containsKey(x)){
                    hm2.put(x, hm2.get(x) + 1);
                } else{
                    hm2.put(x, 1);
                }
            }
        }
        
        for (Integer x : ts){
            if (hm1.containsKey(x) && hm2.containsKey(x)){
                System.out.println(x + " " + hm1.get(x) + " " + hm2.get(x));
            }
            
        }
    }
}
