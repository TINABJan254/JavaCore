package number_theory;

import java.util.Scanner;

public class BacCuaTSNgToTrongNGiaiThua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n, p;
        n = sc.nextLong();
        p = sc.nextLong();
        long ans = 0;
        for (long i = p; i <= n; i *= p){
            ans += n / i;
        }
        System.out.println(ans);
    }
}

/*
Dung CT: Legendary
Cho số tự nhiên N và số nguyên tố P. Nhiệm vụ của bạn là tìm số x lớn nhất để N!
chia hết cho p^x. Ví dụ với N=7, p=3 thì x=2 là số lớn nhất để 7! Chia hết cho
3^2.
Input Format
Cặp số N, p được viết cách nhau một khoảng trống.
Constraints
1≤N≤10^14; 2≤p≤5000
Output Format
Đưa ra kết quả trên một dòng
Sample Input 0
7 3
Sample Output 0
2
*/