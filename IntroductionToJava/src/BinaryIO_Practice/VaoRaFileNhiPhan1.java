package BinaryIO_Practice;

import java.io.*;
import java.util.*;

public class VaoRaFileNhiPhan1 {
    
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static int countDigit(int n){
        String tmp = "" + n;
        return tmp.length();
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DAYSO.dat"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) input1.readObject();
        input1.close();
        
        Collections.sort(a1);
        
        for (Integer x : a1){
            if (isPrime(x) && countDigit(x) >= 3){
                System.out.println(x);
            }
        }
    }
}
