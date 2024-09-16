package number_theory;

import java.util.Scanner;

public class LuyThuaNhiPhan {
    
    public static long powMod(long a, long b){
        long res = 1;
        long MOD = (long)(1e9 + 7);
        while (b != 0){
            if (b % 2 != 0){
                res *= a;
                res %= MOD;
            }
            a *= a;
            a %= MOD;
            b /= 2;
        }
        return (res % MOD);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a, b;
        a = sc.nextLong();
        b = sc.nextLong();
        System.out.println(powMod(a, b));
    }
}
