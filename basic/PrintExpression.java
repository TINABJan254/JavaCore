package basic;

import java.util.Scanner;


public class PrintExpression {
    public static void main(String[] args) {
        int x, y, z, t;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
        t = sc.nextInt();
        System.out.printf("%d,%d,%d,%d\n", y,z,x,t);
        System.out.println(1L*x+y+z+t);
        System.out.println(1L*(x-y+1L*z*t));
        
    }
   
}

/*
Cho 4 số X, Y, Z, T là số nguyên được nhập từ bàn phím. Bạn hãy in ra 3 dòng,
dòng 1 lần lượt 4 số Y,Z,X,T mỗi số cách nhau một dấu phẩy, dòng 2 in ra tổng 4
số, dòng 3 in ra giá trị của biểu thử X - Y + Z * T. (Chú ý giá trị của tích Z * T và
giá trị của tổng 4 số có thể tràn kiểu dữ liệu int)
Input Format
1 dòng chứa 4 số X, Y, Z, T
Constraints
1<=X, Y, Z, T <= 10^9
Output Format
In ra theo yêu cầu đầu bài
Sample Input 0
93 9 93 98
Sample Output 0
9,93,93,98
293
9198
*/
