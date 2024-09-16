package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        
        a[n] = -1;
        for (int i = 0; i < n; i++)
            if (a[i] != a[i + 1])
                System.out.print(a[i] + " ");
    }
}
