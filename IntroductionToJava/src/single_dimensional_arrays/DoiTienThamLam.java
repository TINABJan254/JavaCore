package single_dimensional_arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Arrays;

public class DoiTienThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] root = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int res = 0;
        for (int i = 0; i <= 9; i++){
            res += n / root[i];
            n %= root[i];
        }
        
        System.out.println(res);
    }
}
