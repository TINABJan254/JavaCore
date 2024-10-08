package oop_codeptit.xau_ky_tu;

import java.util.*;

public class J03036_XoayVongKyTu {
    
    public static int rotate(String a, String b) {
        if (a.length() != b.length()) {
            return -1;
        }
        String s = a;
        for (int i = 0; i <= a.length(); i++) {
            if (s.equals(b)) {
                return i;
            }
            s = s.substring(1) + s.charAt(0);
        }
        return -1;
    }
    
    public static int solve(ArrayList<String> a) {
        int ans = Integer.MAX_VALUE;
        for (String x : a) {
            int cnt = 0;
            for (String y : a) {
                int tmp = rotate(y, x);
                if (tmp == -1) {
                    return -1;  
                }
                cnt += tmp;  
            }
            ans = Math.min(ans, cnt);  
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        ArrayList<String> a = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            a.add(sc.next());  
        }
        
        System.out.println(solve(a)); 
    }
}
