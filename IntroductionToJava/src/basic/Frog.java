package basic;

import java.util.Scanner;

public class Frog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        int stepToRight = k / 2;
        int stepToLeft  = k / 2;
        if (k % 2 != 0)
            stepToRight++; //Nhay sang ben phai truoc
        System.out.println(1L * a * stepToRight - 1L * b * stepToLeft);
    }
}
