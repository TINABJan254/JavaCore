package basic;

import java.util.Scanner;

public class MuaNuoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a, b;
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        int res = 0;
        if (a < b/2){
            res = n * a;
        }
        else{
            if (n % 2 != 0)
                res = n / 2 * b + a;
            else
                res = n / 2 * b;
        }
        System.out.println(res);
        sc.close();
    }
}
