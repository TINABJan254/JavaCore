package bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            char[] a = sc.next().toCharArray();
            Arrays.sort(a);
            int sum = 0;
            boolean digitFound = false;
            for (int i = 0; i < a.length; i++){
                if (!Character.isDigit(a[i])){
                    System.out.print(a[i]);
                } else {
                    digitFound = true;
                    sum += a[i] - '0';
                }
            }
            if (digitFound){
                System.out.println(sum);
            } else {
                System.out.println("");
            }
        }
    }
}
