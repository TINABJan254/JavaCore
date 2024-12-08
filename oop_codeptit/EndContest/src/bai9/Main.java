package bai9;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            HashMap<Integer, Integer> hm = new HashMap<>();
            for (int i = 0; i < n; i++){
                int x = sc.nextInt();
                if (hm.containsKey(x)){
                    hm.put(x, hm.get(x) + 1);
                } else {
                    hm.put(x, 1);
                    a.add(x);
                }
            }
            
            Collections.sort(a, new Comparator<Integer>(){
                @Override
                public int compare(Integer o1, Integer o2){
                    return hm.get(o2) - hm.get(o1);
                }
            });
            
            for (Integer x : a){
                for (int i = 0; i < hm.get(x); i++){
                    System.out.print(x + " ");
                }
            }
            System.out.println("");
        }
    }
}
