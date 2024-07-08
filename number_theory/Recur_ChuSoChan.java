package number_theory;

import java.util.Scanner;

public class Recur_ChuSoChan {
    
    public static boolean check(long n){
        if (n < 10)
            return true;
        if ((n % 10) % 2 != 0)
            return false;
        return check(n / 10);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(check(n));
    }
}
