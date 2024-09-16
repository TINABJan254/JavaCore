package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DemChanLeTongChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n + 5];
        for (int i = 0; i < n; i++){
            list[i] = sc.nextInt();
        }
        
        int sumOdd = 0, sumEven = 0;
        int nOdd = 0, nEven = 0;
        for (int i = 0; i < n; i++){
            if (list[i] % 2 == 0){
                ++nEven;
                sumEven += list[i];
            }
            else{
                ++nOdd;
                sumOdd += list[i];
            }
        }
        System.out.println(nOdd + " " + nEven);
        System.out.println(sumOdd + " " + sumEven);
    }
}
