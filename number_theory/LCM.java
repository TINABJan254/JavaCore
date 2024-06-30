package number_theory;

import java.util.Scanner;

public class LCM {
    
    public static int BCNN(int a, int b){
        return (a / GCD.UCLN(a, b) * b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(BCNN(a, b));
    }
}
