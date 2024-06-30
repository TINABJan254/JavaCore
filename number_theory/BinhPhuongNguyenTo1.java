package number_theory;

import java.util.Scanner;

public class BinhPhuongNguyenTo1 {
    
    public static boolean check(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                int mu = 0;
                while (n % i == 0){
                    ++mu;
                    n /= i;
                }
                if (mu >= 2)
                    return true;
            }
        }
        return false;
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
ta se kiem tra duoi dang phan tich thua so nguyen to:
	vd: x = 2.2.3 => x chia het cho 2 va 2^2
	vd: x = 2.3.3.3 => x chia het cho 3 va 3^3
		vay ta chi can pttsnt ra, sau do kiem tra xem thua so nao xuat hien >= 2 lan thi oke

Một số được coi là số đẹp khi nó đồng thời vừa chia hết cho một số nguyên tố và
chia hết cho bình phương của số nguyên tố đó. Viết chương trình liệt kê các số
đẹp như vậy trong đoạn giữa hai số nguyên dương cho trước.
Input Format
2 số nguyên dương a, b
Constraints
1≤a≤b≤10^6
Output Format
In ra các số đẹp trong đoạn từ a tới b
Sample Input 0
4 50
Sample Output 0
4 8 9 12 16 18 20 24 25 27 28 32 36 40 44 45 48 49 5
*/