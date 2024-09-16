package basic;

import java.util.Scanner;

public class BieuDienSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2){
            System.out.println("-1");
            sc.close();
            return;
        }
        int n2 = 0, n3 = 0;
        while (n != 0){
            if (n % 2 == 0){
                ++n2;
                n -= 2;
            }
            else{
                ++n3;
                n -= 3;
            }
        }
        System.out.println(n2 + n3);
        for (int i = 0; i < n2; i++){
            System.out.print(2 + " ");
        }
        for (int i = 0; i < n3; i++)
            System.out.print(3 + " ");
    }
}
