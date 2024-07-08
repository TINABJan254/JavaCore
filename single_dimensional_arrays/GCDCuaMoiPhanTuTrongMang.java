package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class GCDCuaMoiPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int res = a[0];
        for (int i = 1; i < n; i++)
            res = number_theory.GCD.UCLN(res, a[i]);
        System.out.println(res);
    }
}
