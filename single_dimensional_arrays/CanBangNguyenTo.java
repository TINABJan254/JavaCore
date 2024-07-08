package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class CanBangNguyenTo {
    
    public static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        int[] prefix = new int[n + 5];
        Arrays.fill(prefix, 0);
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            if (i == 0)
                prefix[i] = a[i];
            else
                prefix[i] = a[i] + prefix[i - 1];
        }
        
        for (int i = 1; i < n - 1; i++){
            if (isPrime(prefix[i - 1]) && isPrime(prefix[n - 1] - prefix[i]))
                System.out.print(i + " ");
        }
    }
}
