package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SoLonHonCacSoDungTruoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int maxE = -1;
        for (int i = 0; i < n; i++)
            if (a[i] > maxE){
                System.out.print(a[i] + " ");
                maxE = a[i];
            }
    }
}
