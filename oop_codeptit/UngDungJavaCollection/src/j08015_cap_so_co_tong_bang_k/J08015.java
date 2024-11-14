package j08015_cap_so_co_tong_bang_k;

import java.util.*;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] a = new long[n + 1];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextLong();
            }
            
            long res = 0;
            HashMap<Long, Long> hm = new HashMap<>();
            for (int i = 0; i < n; i++){
                long tmp = k - a[i];
                if (hm.containsKey(tmp)){
                    res += hm.get(tmp);
                }
                hm.put(a[i], hm.getOrDefault(a[i], 0L) + 1);
            }
            
            System.out.println(res);
        }
    }
}
