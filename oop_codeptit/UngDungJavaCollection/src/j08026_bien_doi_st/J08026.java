package j08026_bien_doi_st;

import java.util.*;

public class J08026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            int s = sc.nextInt();
            int t = sc.nextInt();
            Queue<Map.Entry<Integer, Integer>> q = new LinkedList<>();
            Set<Integer> used = new HashSet<>();
            used.add(s);
            q.offer(new AbstractMap.SimpleEntry<>(s, 0));
            while (!q.isEmpty()){
                int u = q.peek().getKey();
                int step = q.poll().getValue();
                if (u == t){
                    System.out.println(step);
                    break;
                }
                
                int v1 = u * 2;
                int v2 = u - 1;
                if (u < t && !used.contains(v1)){
                   q.offer(new AbstractMap.SimpleEntry<>(v1, step + 1));     
                   used.add(v1);
                }
                if (v2 > 0 && !used.contains(v2)){
                    q.offer(new AbstractMap.SimpleEntry<>(v2, step + 1));
                    used.add(v2);
                }
            }
        }
    }
}
