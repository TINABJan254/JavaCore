package thuchanh2.bai3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair<Integer, Integer>> edgeList = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int x = sc.nextInt();
                if (i < j && x == 1){
                    edgeList.add(new Pair(i, j));
                }
            }
        }
        
        for (Pair edge : edgeList){
            System.out.println(edge);
        }
        
    }
}
