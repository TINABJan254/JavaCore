package number_theory;

import java.util.Scanner;

public class BinhPhuongNguyenTo2 {
    
    public static boolean check(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int mu = 0;
                while (n % i == 0){
                    ++mu;
                    n /= i;
                }
                if (mu < 2)
                    return false;
            }
        }
        
        if (n != 1)
            return false;
        return true;
    }
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a, b; 
       a = sc.nextInt();
       b = sc.nextInt();
       for (int i = a; i <= b; i++){
           if (check(i))
               System.out.print(i + " ");
       }
    }
}

/*

tuong tu voi bai BinhPhuongNguyenTo1, nhung o day neu da chia het cho 1 so nt thi cung phai chia het cho binh phuong
so nguyen to do
vd:    x = 2.2.3.3 => correct
    x = 2.2.3   => wrong

Một số được coi là số đẹp khi nếu nó chia hết cho một số nguyên tố nào đó thì
cũng phải chia hết cho bình phương của số nguyên tố đó. Viết chương trình liệt
kê các số đẹp như vậy trong đoạn giữa hai số nguyên dương cho trước
Input Format
2 số nguyên dương a, b
Constraints
1≤a≤b≤10^6
Output Format
In ra các số đẹp trong đoạn từ a tới b
Sample Input 0
3 49

Sample Output 0
4 8 9 16 25 27 32 36 49
*/
