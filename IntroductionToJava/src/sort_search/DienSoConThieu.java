package sort_search;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class DienSoConThieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minE = Integer.MAX_VALUE;
        int maxE = Integer.MIN_VALUE;
        int[] fre = new int[1000005];
        for (int i = 0; i < 1000005; i++)
            fre[i] = 0;
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            fre[x] = 1;
            minE = Math.min(minE, x);
            maxE = Math.max(maxE, x);
        }
        
        int res = 0;
        for (int i = minE; i <= maxE; i++)
            if (fre[i] == 0)
                ++res;
        
        System.out.println(res);
    }
}

/*
Cho mảng A[] gồm n số nguyên dương. Gọi L, R là min và max các phần tử của
A[]. Nhiệm vụ của bạn là tìm số phần tử cần thiết cần thêm vào mảng để mảng
có đầy đủ các số trong khoảng [L, R]. Ví dụ A[] = {5, 7, 9, 3, 6, 2 } ta nhận được
kết quả là 2 tương ứng với các số còn thiếu là 4, 8.
Input Format
Dòng đầu tiên đưa vào n, tương ứng với số phần tử của mảng A[]; dòng tiếp theo
là n số A[i] ; các số được viết cách nhau một vài khoảng trống.
Constraints
1=n<=10^6; 0<=a[i]<=10^6;

Output Format
In ra số lượng số còn thiếu
Sample Input 0
5
4 5 3 8 6
Sample Output 0
1
*/
