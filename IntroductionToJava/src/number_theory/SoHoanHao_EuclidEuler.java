package number_theory;

import java.util.Scanner;

public class SoHoanHao_EuclidEuler {
    
    public static boolean isPrime(long n){
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }
    
    public static boolean isPerfect(long n){
        for (int p = 1; p <= 33; p++){
            if (isPrime(p)){
                long tmp1 = (long)Math.pow(2, p) - 1;
                if (isPrime(tmp1)){
                    long tmp2 = (long)Math.pow(2, p - 1);
                    if (tmp1 * tmp2 == n)
                        return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n; 
        n = sc.nextLong();
        if (isPerfect(n))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

/*
Số hoàn hảo là số có tổng các ước thực sự (Không tính chính nó) bằng chính số
đó. Cho một số nguyên dương n, kiểm tra xem n có phải là số hoàn hảo hay
không.
Định lý Euclid - Euler :' Nếu p là số nguyên tố và 2^p - 1 cũng là số nguyên tố
thì : 2^(p-1) * (2^p - 1) sẽ tạo thành 1 số hoàn hảo. Ví dụ p = 2, 2^2 - 1 = 3, 2 *
3 = 6 => HH Ví dụ p = 3, 2^3 - 1 = 7, 4 * 7 = 28 => HH
Input Format
Số nguyên dương N
Constraints
1≤N≤9*10^18
Output Format
In YES nếu N là số hoàn hảo, ngược lại in NO
Sample Input 0
28
Sample Output 0
YES
Explanation 0
28 có các ước thực sự là 1, 2, 4, 7, 14 có tổng bằng 28.
*/
