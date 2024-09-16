package two_dimensional_arrays;

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
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class PhanTuXuatHienOMoiHang {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
            mp.put(a[0][i], 0);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++)
                if (mp.containsKey(a[i][j]) && mp.get(a[i][j]) == i - 1)
                     mp.put(a[i][j], i);
        }
        
        boolean Found = false;
        Set<Map.Entry<Integer, Integer>> se = mp.entrySet();
        for (Map.Entry<Integer, Integer> entry : se)
            if (entry.getValue() == n - 1){
                System.out.print(entry.getKey() + " ");
                Found = true;
            }
        
        if (!Found)
            System.out.println("NOT FOUND");
    }
}
/*
Cho ma trận vuông A[N][N]. Hãy in ra các số xuất hiện ở mọi hàng theo thứ tự từ
bé đến lớn, mỗi giá trị xuất hiện chỉ liệt kê 1 lần.
Input Format
Dòng đầu tiên đưa vào N là cấp của ma trận A[N][N]; N dòng tiếp mỗi dòng gồm
N số nguyên.
Constraints
1≤N≤100; 0≤A[i][j]≤100
Output Format
In ra các giá trị xuất hiện trên mọi dòng của ma trận, các số in cách nhau một
dấu cách. Nếu không tồn tại giá trị nào thỏa mãn in ra "NOT FOUND".
Sample Input 0
4
1 2 2 3
2 1 2 4
1 4 5 2
2 2 3 1
Sample Output 0
1 2
*/