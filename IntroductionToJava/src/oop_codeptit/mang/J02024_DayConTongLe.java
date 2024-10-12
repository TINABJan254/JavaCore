package oop_codeptit.mang;

import java.util.*;

public class J02024_DayConTongLe {
    
    private static int n;
    private static Integer[] a;
    private static int[] x;
    private static boolean isFinal;
    
    
    public static boolean check(){
        int t = 0;
        for (int i = 0; i < n; i++){
            if (x[i] == 1){
                t += a[i];
            }
        }
        return t % 2 != 0;
    }
        
    public static void display(){
        for (int i = 0; i < n; i++){
            if (x[i] == 1){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("");
    }
    
    public static void genNext(){
        int i = n - 1;
        while (i >= 0 && x[i] == 1){
            x[i] = 0;
            --i;
        }
        if (i < 0){
            isFinal = true;
        } else {
            x[i] = 1;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            a = new Integer[n];
            x = new int[n];
            isFinal = false;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                x[i] = 0;
            }
            
            Arrays.sort(a, Collections.reverseOrder());
            while (!isFinal){
                if (check()){
                    display();
                }
                genNext();
            }
            
        }
    }
}
