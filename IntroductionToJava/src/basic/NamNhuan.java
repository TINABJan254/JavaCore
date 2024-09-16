package basic;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if ((n % 400 == 0) || ((n % 100 != 0) && (n % 4 == 0)))
            System.out.println(n + " La nam nhuan");
        else
            System.out.println(n + " Khong phai la nam nhuan");
    }
}
