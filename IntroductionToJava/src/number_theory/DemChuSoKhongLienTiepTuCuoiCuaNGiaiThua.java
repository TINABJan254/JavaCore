package number_theory;

import java.util.Scanner;

public class DemChuSoKhongLienTiepTuCuoiCuaNGiaiThua {
    
    public static int solve(long n){
        int ans = 0;
        int MOD = (int)(1e9 + 7);
        for (int i = 5; i <= n; i *= 5){
            ans += n / i;
            ans %= MOD;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n;
        n = sc.nextLong();
        System.out.println(solve(n));
    }
}

/*
In ra số lượng chữ số 0 liên tiếp tính từ cuối của N! Ví dụ bạn có N = 10, 10!=
3628800. Như vậy, 10! có 2 chữ số 0 liên tiếp tính từ cuối.
Gợi ý : Số 0 ở cuối của N! có được bằng cách nhân số 2 với số 5, cứ mỗi cặp (2, 5)
trong N! sẽ tạo ra 1 số 0 ở cuối vì thế số lượng chữ số 0 liên tiếp tính từ cuối của
N! sẽ bằng số cặp (2, 5) trong N!, mà số lượng số 2 trong N! bao giờ cũng lớn hơn
số lượng số 5! trong N! => Số cặp (2, 5) trong N! chính là số lượng số 5 trong N!
hay bậc của 5 trong N!
Input Format
Số nguyên dương N
Constraints
1≤N≤10^18
Output Format
In ra số lượng chữ số 0 liên tiếp tính từ cuối của N!. Kết quả lấy dư với
1000000007.
Sample Input 0
10
Sample Output 0
2
*/