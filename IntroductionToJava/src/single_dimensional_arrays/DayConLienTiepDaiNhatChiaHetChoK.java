package single_dimensional_arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class DayConLienTiepDaiNhatChiaHetChoK{    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Map<Long, Integer> mp = new HashMap<>();
        mp.put(0L, 0);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0;
        int res = -1;
        for (int i = 1; i <= n; i++){
            int x = sc.nextInt();
            sum += x;
            long r = (sum % k + k) % k;
            if (mp.containsKey(r)){
                res = Math.max(res, i - mp.get(r));
            }
            else
                mp.put(r, i);
        }
        
        System.out.println(res);
    }
}

/*
Cho mảng A[] gồm N phần tử và số nguyên dương K, 
nhiệm vụ của bạn là tìm dãy con liên tiếp dài nhất có tổng chia hết cho K.

Bài này bạn cần tính tổng tích lũy đối với các chỉ số i trong mảng, 
tức là tổng các phần từ từ chỉ số 0 tới i, sau đó chia dư số này với K, được lưu vào biến R. 
Giả sử bạn đang ở chỉ số i và muốn xác định xem có dãy con nào kết thúc tại i mà có tổng chia hết cho K hay ko? 
Khi đó bạn cần check xem có chỉ số j nào < i mà tổng tích lũy từ 0 tới j chia cho K cũng dư R hay ko. 
Khi đó dãy con từ j + 1 tới i sẽ có tổng chia K dư 0. 
Ví dụ dãy A[] = {3, 7, 8, 4, 6} và K = 5, xét i tại 4 thì R = (3 + 7 + 8 + 4 + 6) % 5 = 3 và 
bạn thấy có 1 dãy con kết thúc tại j = 0 có R = (3) % 5 = 3 => dãy 7, 8, 4, 6 sẽ có tổng chia hết cho 5.

Input Format

Dòng thứ nhất gồm N K; Dòng thứ 2 gồm các phần tử trong mảng A[];

Constraints

1<=K<=N<=10^6; -10^6<=A[i]<=10^6;

Output Format

In ra dãy con dài nhất hoặc in ra -1 nếu không tồn tại dãy con chia hết cho K.

Sample Input 0

12 2
-4 1 4 -4 4 4 -3 4 2 -4 2 4
Sample Output 0

12
*/