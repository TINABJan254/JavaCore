package number_theory;

import java.util.Scanner;

public class ToHop_Recur{
    
    public static int C(int n, int k){
        if (n == k || k == 0)
            return 1;
        return C(n - 1, k - 1) + C(n - 1, k);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        System.out.println(C(n, k));
    }
}
