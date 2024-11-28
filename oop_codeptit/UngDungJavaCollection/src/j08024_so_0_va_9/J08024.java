package j08024_so_0_va_9;

import java.util.*;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Queue<Long> q = new LinkedList<>();
        ArrayList<Long> res = new ArrayList<>();
        q.offer(9L);
        while (true){
            long u = q.poll();
            if (u > 1e15){
                break;
            }
            res.add(u);
            q.offer(u * 10);
            q.offer(u * 10 + 9);
        }
        
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            for (Long x : res){
                if (x % n == 0){
                    System.out.println(x);
                    break;
                }
            }
        }
    }
}
