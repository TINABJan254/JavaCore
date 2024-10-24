package luyen_tap_1;

import java.util.*;

public class BaiTap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            TreeSet<Integer> chan = new TreeSet<>();
            TreeSet<Integer> le = new TreeSet<>(Collections.reverseOrder());
            
            for (int i = 0; i < n; i++){
                int x = sc.nextInt();
                if (x % 2 == 0){
                    chan.add(x);
                } else {
                    le.add(x);
                }
            }
            
            for (Integer x : chan){
                System.out.print(x + " ");
            }
            System.out.println("");
            for (Integer x : le){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
