package basic;

import java.util.Scanner;

public class LatDaQuangTruong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        int w = n / a;
        if (n % a != 0)
            ++w;
        int L = m / a;
        if (m % a != 0)
            ++L;
        System.out.println(1L*L*w);
        sc.close();
    }
}
