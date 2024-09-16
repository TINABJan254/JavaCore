package basic;

import java.util.Scanner;

public class SoLonNhatVaNhoNhat {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((a / b * b) + "\n" + ((a + b - 1) / b * b));
    }
}
/*
So lon nhat <= a chia het cho b: a / b * b;
So be nhat  >= a chia het cho b: (a + b - 1) / b * b;
*/