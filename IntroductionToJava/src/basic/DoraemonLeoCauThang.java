package basic;

import java.util.Scanner;

public class DoraemonLeoCauThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int min, max = n; //số bước tối đa bao giờ cũng là n bước (đi n bậc)
        if (n % 2 == 0)
            min = n / 2; //số bậc thang là chẵn thì tối thiểu cần n/2 bậc
        else    
            min = n / 2 + 1; // số bạc thang là lẻ thì tối thiểu cần n/2 bậc + 1 bậc lẻ còn lại
        //bài toàn bây giờ đặt ra:  tìm nhỏ nhất >= min mà chia hết cho m nhưng phải bé hơn max
        int res = (min + m - 1) / m * m;
        if (res <= max)
            System.out.println(res);
        else   
            System.out.println("-1");
        sc.close();
    }
}
