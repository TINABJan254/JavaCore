package number_theory;

import java.util.Scanner;

public class SoThuanNguyenTo {
    
    public static boolean primeDigit(int n){
        while (n != 0){
            int r = n % 10;
            n /= 10;
            if (r != 2 && r != 3 && r != 5 && r != 7)
                return false;
        }
        return true;
    }
    
    public static boolean primeSumDigit(int n){
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        return (PrimeNumber.isPrime(sum));
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int res = 0;
        for (int i = a; i <= b; i++){
            if (primeSumDigit(i) && primeDigit(i) && PrimeNumber.isPrime(i))
                ++res;
        }
        System.out.println(res);
    }
}
