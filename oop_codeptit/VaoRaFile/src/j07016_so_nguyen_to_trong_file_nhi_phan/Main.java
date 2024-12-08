package j07016_so_nguyen_to_trong_file_nhi_phan;

import java.util.*;
import java.io.*;

public class Main {
    
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream os2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        
        ArrayList<Integer> a = (ArrayList<Integer>) os1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) os2.readObject();
        
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();
        TreeSet<Integer> res = new TreeSet<>();
        
        for (Integer x : a){
            if (isPrime(x)){
                if (hm1.containsKey(x)){
                    hm1.put(x, hm1.get(x) + 1);
                } else {
                    hm1.put(x, 1);
                }
                res.add(x);
            }
        }
        
        for (Integer x : b){
            if (isPrime(x)){
                if (hm2.containsKey(x)){
                    hm2.put(x, hm2.get(x) + 1);
                } else {
                    hm2.put(x, 1);
                }
                res.add(x);
            } 
            
        }
        
        for (Integer x : res){
            if (hm1.containsKey(x) && hm2.containsKey(x)){
                System.out.println(x + " " + hm1.get(x) + " " + hm2.get(x));
            }
        }
    }
}
