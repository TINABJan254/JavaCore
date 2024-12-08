package bai3;

import java.util.*;

public class Main {
    
    public static long findRes(long n){
        long res = -1;
        for (int i = 2; i <= (int)Math.sqrt(n); i++){
            if (n % i == 0){
                res = i;
                while (n % i == 0){
                    n /= i;
                }
            }
        }
        if (n != 1){
            return n;
        } 
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextLong();
            System.out.println(findRes(n));
        }
    }   
}
