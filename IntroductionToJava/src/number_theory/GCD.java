package number_theory;

import java.util.Scanner;

public class GCD {
    
    public static int UCLN(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(UCLN(a, b));
        sc.close();
    }
}
