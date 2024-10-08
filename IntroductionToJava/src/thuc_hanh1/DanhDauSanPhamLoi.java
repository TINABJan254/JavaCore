package thuc_hanh1;

import java.util.*;

public class DanhDauSanPhamLoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] a = new int[m];
        for (int i = 0; i < m; i++){
            a[i] = sc.nextInt();
        }
        
        System.out.print("Errors: ");
        int i = 0;
        while (i < m){
            int j = i;
            while (i < m - 1 && a[i] == a[i + 1]){
                ++i;
            }
            if (i < m && i != j){
                System.out.printf("%d-%d", i, j);
                if (i != m - 1){
                    System.out.print(", ");
                }
                else{
                    System.out.println("and");
                }
            }
        }
        
    }
}
