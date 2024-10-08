package thuc_hanh1;

import java.util.*;
import java.io.*;

public class DocFileNhiPhan1 {
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static int numDigit(int n){
        String tmp = n + "";
        return tmp.length();
    }
    
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        
        TreeSet<Integer> res = new TreeSet<>();
        for (Integer x : a){
            if (isPrime(x) && numDigit(x) >= 3){
                res.add(x);
            }
        }
        
        for (Integer x : res){
            System.out.println(x);
        }
    }
}
