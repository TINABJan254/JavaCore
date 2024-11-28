package jkt013_so_loc_phat;

import java.util.*;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            Queue<Long> q = new LinkedList<>();
            ArrayList<Long> res = new ArrayList<>();
            q.offer(6L);
            q.offer(8L);
            while (true) {
                long u = q.poll();
                if ((u + "").length() > n){
                    break;
                }
                res.add(u);
                q.offer(u * 10 + 6);
                q.offer(u * 10 + 8);
            }
            System.out.println(res.size());
            for (int i = res.size() - 1; i >= 0; i--){
                System.out.print(res.get(i) + " ");
            }
            System.out.println("");
        }
        
    }
}
