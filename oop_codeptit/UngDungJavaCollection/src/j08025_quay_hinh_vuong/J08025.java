package j08025_quay_hinh_vuong;

import java.util.*;

public class J08025 {
    
    public static String deleteSpace(String s){
        String res = "";
        for (char x : s.toCharArray()){
            if (x != ' '){
                res += x;
            }
        }
        return res;
    }
    
    public static String rotateLeftSquare(String s){
        String res = "" + s.charAt(3) + s.charAt(0) + s.charAt(2) + s.charAt(4) + s.charAt(1) + s.charAt(5);
        return res;
    }
    
    public static String rotateRightSquare(String s){
        String res = "" + s.charAt(0) + s.charAt(4) + s.charAt(1) + s.charAt(3) + s.charAt(5) + s.charAt(2);
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            String s = deleteSpace(sc.nextLine());
            String des = deleteSpace(sc.nextLine());
            Queue<Map.Entry<String, Integer>> q = new LinkedList<>();
            Set<String> used = new HashSet<>();
            q.offer(new AbstractMap.SimpleEntry<>(s, 0));
            used.add(s);
            while (!q.isEmpty()){
                String u = q.peek().getKey();
                int step = q.poll().getValue();
                if (u.equals(des)){
                    System.out.println(step);
                    break;
                }
                String v1 = rotateLeftSquare(u);
                String v2 = rotateRightSquare(u);
                if (!used.contains(v1)){
                    q.offer(new AbstractMap.SimpleEntry<>(v1, step + 1));
                    used.add(v1);
                }
                if (!used.contains(v2)){
                    q.offer(new AbstractMap.SimpleEntry<>(v2, step + 1));
                    used.add(v2);
                }
            }
        }
    }
}
