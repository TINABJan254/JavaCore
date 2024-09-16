package number_theory;

import java.util.Scanner;

public class PhanTichTSNT2 {
    
    public static void pt2(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int cnt = 0;
                while (n % i == 0){
                    ++cnt;
                    n /= i;
                }
                System.out.print(i + "^" + cnt);
                if (n != 1)
                    System.out.print(" * ");
            }
        }
        
        if (n != 1)
            System.out.print(n + "^1");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        pt2(n);
    }
}
