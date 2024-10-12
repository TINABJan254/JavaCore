package oop_codeptit.mang;

import java.util.*;

public class J02026_DayConCoKPhanTu {
    
    private static int n, k;
    private static Integer[] a;
    private static Integer[] x;
    private static boolean isFinal;
    
    public static void display(){
        for (int i = 0; i < k; i++){
            System.out.print(x[i] + " ");
        }
        System.out.println("");
    }
    
    public static void Try(int i, int start){
        for (int j = start; j < n; j++){
            x[i] = a[j];
            if (i == k - 1){
                display();
            }
            if (i < k - 1){
                Try(i + 1, j + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            k = sc.nextInt();
            a = new Integer[n];
            x = new Integer[n];
            isFinal = false;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);
            Try(0, 0);
            
        }
    }
}
