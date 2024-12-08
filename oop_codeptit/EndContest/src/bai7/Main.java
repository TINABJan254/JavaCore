package bai7;

import java.util.*;

public class Main {
    
    private static int rotate(String x, String y){
        String tmp = y;
        for (int i = 0; i < y.length(); i++){
            if (tmp.equals(x)){
                return i;
            }
            tmp = tmp.substring(1) + tmp.charAt(0);
        }
        return -1;
    }
    
    private static int solve(ArrayList<String> a){
        int ans = Integer.MAX_VALUE;
        for (String x : a){
            int cnt = 0;
            for (String y : a){
                int tmp = rotate(x, y);
                if (tmp == -1){
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
        for (int i = 0; i < n; i++){
            a.add(sc.next());
        }
        System.out.println(solve(a));
    }
}
