package j07076_sap_xep_ma_tran;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int col = sc.nextInt();
            int[][] data = new int[n][m];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    data[i][j] = sc.nextInt();
                }
            }
            
            Matrix a = new Matrix(n, m, data);
            a.sortCol(col - 1);
            
            System.out.println(a);
            
        }
    }
}
