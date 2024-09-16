package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02104_DanhSachCanh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int x = sc.nextInt();
                if (x == 1 && i < j) {
                    System.out.printf("(%d,%d)\n", i, j);
                }
            }
        }
    }
}
