package number_theory;

import java.util.Scanner;

public class PrimeNumber {
    
    public static boolean isPrime(long n){
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        if (isPrime(n))
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
