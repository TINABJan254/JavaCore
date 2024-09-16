import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long y = sc.nextLong();
        sc.nextLine();
        char c = sc.nextLine().charAt(0);
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.printf("%.2f\n", f);
        System.out.printf("%.9f", d);
    }
}

/*
Đề bài yêu cầu bạn nhập : Dòng 1 là số nguyên X, dòng 2 là số nguyên Y, dòng 3
là kí tự C, dòng 4 là số thực float F, dòng 5 là số thực double D. Nhiệm vụ của bạn
là in ra 5 dòng. Dòng 1 in X, dòng 2 in Y, dòng 3 in C, dòng 4 in F với 2 số đằng
sau dấu phẩy, dòng 5 in D với 9 số sau dấu phẩy.
Chú ý : Bài này đối với Java, trước khi sc.nextLine().charAt(0) để nhập kí tự C bạn
phải thêm 1 câu lệnh sc.nextLine() ở dòng trên để hàm này đọc kí tự xuống dòng
ở dòng số 2 nếu không sẽ bị sai.
Input Format
5 dòng lần lượt là X, Y, C, F, D
Constraints
-10^9<=X<=10^9; -10^18<=Y<=10^18; C là kí tự in hoa hoặc in thường; -
10^6<=F<=10^6; -10^9<=D<=10^9;

Output Format
In ra 5 dòng theo yêu cầu
Sample Input 0
614
999999999999990528
G
19.088
2.9648
Sample Output 0
614
999999999999990528
G
19.09
2.964800000
*/