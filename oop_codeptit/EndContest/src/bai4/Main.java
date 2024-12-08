package bai4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            long mul = 1, sum = 0;
            for (int i = 0; i < s.length(); i++){
                if (i % 2 == 0){
                    if (s.charAt(i) != '0'){
                        mul *= (s.charAt(i) - '0');
                    }
                } else {
                    sum += s.charAt(i) - '0';
                }
            }
            System.out.println(mul + " " + sum);
        }
    }
}
