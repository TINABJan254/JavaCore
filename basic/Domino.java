package basic;

import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        long numDomino = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        if (m % 2 == 0){
            numDomino = m / 2;
            numDomino *= 1l*n;
        }
        else{
            m -= 1;
            numDomino = m / 2;
            numDomino *= 1l*n;
            numDomino += (n / 2);
        }
        System.out.println(numDomino);
        sc.close();
    }
}

/*
Tính xem mỗi cột cần đặt bao nhiêu thanh domino (đặt dọc) =>
nhân với số cột là ra số thanh domino. Trong trường hợp số hàng của HCN
là số chẵn thì số domino trên 1 cột sẽ là m / 2, còn trong trường hợp hàng
lẻ thì bạn tính số domino của HCN (m - 1) * n trước rồi xét hàng cuối cùng
(đặt ngang)
*/
