package j07029_so_nguyen_to_lon_nhat_trong_file;

import java.util.*;
import java.io.*;

public class J07029 {
    
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        int[] d = new int[1000005];
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        for (Integer x : a){
            if (isPrime(x)){
                d[x]++;
            }
        }
        
        int cnt = 0;
        for (int i = 1000000; i >= 2; i--){
            if (cnt < 10 && d[i] != 0){
                System.out.println(i + " " + d[i]);
                ++cnt;
            }
        }
    }
}
