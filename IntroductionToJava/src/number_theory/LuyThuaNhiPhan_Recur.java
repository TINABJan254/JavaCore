package number_theory;

import java.util.Scanner;

public class LuyThuaNhiPhan_Recur {
    public static int MOD = (int)(1e9 + 7);
    
    public static long powMod_recur(long a, long b){
        if (b == 0)
            return 1;
        long tmp = powMod_recur(a, b / 2);
        if (b % 2 == 0)
            return ( (tmp % MOD) * (tmp % MOD) ) % MOD;
        return (((tmp % MOD) * (tmp % MOD)) % MOD * (a % MOD)) % MOD;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b; 
        a = sc.nextLong();
        b = sc.nextLong();
        System.out.println(powMod_recur(a, b));
    }
}
