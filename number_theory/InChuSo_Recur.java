package number_theory;

import java.util.Scanner;

public class InChuSo_Recur {
    
    public static void solve1(long n){
        if (n < 10){
            System.out.println(n);
        }
        else{
            System.out.print((n % 10) + " ");
            solve1(n / 10);
        }
    }
    
    public static void solve2(long n){
        if (n < 10){
            System.out.print(n + " ");
            return;
        }
        solve2(n / 10);
        System.out.print((n % 10) + " ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        solve1(n); //right to left
        solve2(n); //left to right;
    }
}
