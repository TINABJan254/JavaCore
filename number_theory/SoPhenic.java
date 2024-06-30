package number_theory;

import java.util.Scanner;

public class SoPhenic {
    
    public static boolean isPhenic(long n){
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                ++cnt;
                int mu = 0;
                while (n % i == 0){
                    ++mu;
                    n /= i;
                }
                if (mu > 1)
                    return false;
            }
        }
        if (n != 1)
            ++cnt;
        return cnt == 3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        if (isPhenic(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
