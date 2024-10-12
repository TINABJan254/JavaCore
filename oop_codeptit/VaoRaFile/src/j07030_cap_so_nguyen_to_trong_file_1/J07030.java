package j07030_cap_so_nguyen_to_trong_file_1;

import java.util.*;
import java.io.*;

public class J07030 {
    
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>)in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>)in2.readObject();
        
        TreeMap<Integer, Integer> res = new TreeMap<>();
        for (Integer x : a){
            if (isPrime(x) && x <= 500000){
                int y = 1000000 - x;
                if (isPrime(y)){
                    int k = b.indexOf(y);
                    if (k != -1){
                        res.put(x, y);
                    }
                }
            }
        }
        
        for (Integer x : res.keySet()){
            System.out.println(x + " " + res.get(x));
        }
        
    }
}