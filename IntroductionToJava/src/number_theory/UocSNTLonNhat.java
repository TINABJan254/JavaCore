package number_theory;

import java.util.Scanner;

public class UocSNTLonNhat {
    
    public static long MaxPrimeFactor(long n){
        long res = -1;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                res = i;
                while (n % i == 0)
                    n /= i;
            }
        }
        if (n != 1)
            res = n;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- > 0){
            long n; 
            n = sc.nextLong();  
            System.out.println(MaxPrimeFactor(n));
        }
    }
}
