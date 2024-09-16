package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;

public class DieHard {
    
    public static boolean check(int[] a, int n){
        int cnt_25 = 0, cnt_50 = 0;
        for (int i = 0; i < n; i++){
            if (a[i] == 25)
                cnt_25++;
            else if (a[i] == 50){
                if (cnt_25 == 0)
                    return false;
                --cnt_25;
                ++cnt_50;
            }
            else{
                if (cnt_25 == 0 || (cnt_25 * 25 + cnt_50 * 50 < 100))
                    return false;
                if (cnt_50 != 0){
                    --cnt_50;
                    --cnt_25;
                }
                else
                    cnt_25 -= 3;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 5];   
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        if (check(a, n))
            System.out.println("YES");
        else
            System.out.println("NO");
        
    }
}
