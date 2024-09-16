package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02021_LietKeToHop2 {
    public static boolean isFinal;
    public static int n, k;
    public static int[] x = new int[25];
    
    public static void display(){
        for (int i = 0; i < k; i++){
            System.out.print(x[i]);
        }
        System.out.print(" ");
    }
    
    public static void genNext(){
        int i = k - 1;
        while (i >= 0 && x[i] == n - k + i + 1){
            --i;
        }
        
        if (i < 0){
            isFinal = true;
        }
        else{
            x[i++]++;
            for (; i < k; i++){
                x[i] = x[i - 1] + 1;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < k; i++){
            x[i] = i + 1;
        }
        
        int cnt = 0;
        isFinal = false;
        while (!isFinal){
            ++cnt;
            display();
            genNext();
        }
        System.out.println("");
        System.out.println("Tong cong co " + cnt + " to hop");
    }
}
