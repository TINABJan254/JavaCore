package thuc_hanh1;

import java.util.*;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);
        
        int L = 0, R = n - 1;
        while (L < n - 1 && a[L] == a[L + 1]){
            ++L;
        }
        while (R > 0 && a[R] == a[R - 1]){
            --R;
        }
        
        double s = 0;
        for (int i = L + 1; i < R; i++){
            s += a[i];
        }
        
        System.out.printf("%.2f", s / (R-L-1));
    }
}
