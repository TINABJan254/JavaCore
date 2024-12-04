package j08029_quan_ma;

import java.util.*;

public class J08029 {
    
    private static int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
    private static int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};
    
    private static int s, t, u, v;
    private static boolean[][] visited;
    
    private static int BFS(){
        Queue<Map.Entry<Map.Entry<Integer, Integer>, Integer>> q = new LinkedList<>();
        q.offer(new AbstractMap.SimpleEntry<>(new AbstractMap.SimpleEntry<>(s, t), 0));
        while (!q.isEmpty()){
            int x = q.peek().getKey().getKey();
            int y = q.peek().getKey().getValue();
            int step = q.poll().getValue();
            if (x == u && y == v){
                return step;
            }
            
            for (int k = 0; k < 8; k++){
                int x1 = dx[k] + x;
                int y1 = dy[k] + y;
                
                if (x1 >= 1 && x1 <= 8 && y1 >= 1 && y1 <= 8 && !visited[x1][y1]){
                    q.offer(new AbstractMap.SimpleEntry<>(new AbstractMap.SimpleEntry<>(x1, y1), step + 1));
                    visited[x1][y1] = true;
                }
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            String ST = sc.next(), EN = sc.next();
            s = ST.charAt(0) - 'a' + 1;
            t = ST.charAt(1) - '0';
            u = EN.charAt(0) - 'a' + 1;
            v = EN.charAt(1) - '0';
            
            visited = new boolean[10][10];
            System.out.println(BFS());   
        }
    }
}
