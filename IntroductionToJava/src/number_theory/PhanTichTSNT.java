package number_theory;

import java.util.Scanner;

public class PhanTichTSNT {
    
    public static void phanTich(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                while (n % i == 0){
                    System.out.print(i + " ");
                    n /= i;
                }
            }
        }
        
        if (n != 1) 
            System.out.println(n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        phanTich(n);
    }
}
