package number_theory;

import java.util.*;

public class DemUoc {
    
    public static int demUoc(int n){
        int res = 1;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int mu = 0;
                while (n % i == 0){
                    ++mu;
                    n /= i;
                }
                res *= (mu + 1);
            }
        }
        if (n > 1)
            res *= 2;
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; 
        n = sc.nextInt();
        System.out.println(demUoc(n));
    }
}
/*
pttsnt cua n: n = p1^e1 + p2^e2 + ... + pn^n
=> so uoc cua n: t = (e1 + 1) * (e2 + 1) * ... * (en + 1);

*/