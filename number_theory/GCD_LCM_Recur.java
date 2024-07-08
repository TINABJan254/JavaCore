package number_theory;

import java.util.Scanner;

public class GCD_LCM_Recur {
    
    public static long gcd_recur(long a, long b){
        if (b == 0)
            return a;
        return gcd_recur(b, a % b);
    }
    
    public static long lcm(long a, long b){
        return a / gcd_recur(a, b) * b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b; 
        a = sc.nextLong();
        b = sc.nextLong();
        System.out.println(gcd_recur(a, b));
        System.out.println(lcm(a, b));
    }
}

