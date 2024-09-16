package single_dimensional_arrays;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class TronHaiDayDaSapXep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            a.add(x);
        }
        for (int i = 0; i < m; i++){
            int x = sc.nextInt();
            b.add(x);
        }
        
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()){
            if (a.get(i) < b.get(j))
                System.out.print(a.get(i++) + " ");
            else
                System.out.print(b.get(j++) + " ");
        }
        
        while (i < a.size())
            System.out.print(a.get(i++) + " ");
        while (j < b.size())
            System.out.print(b.get(j++) + " ");
    }
}
