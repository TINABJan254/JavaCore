package bai6;

import java.util.*;

public class Bai6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            int choice = Integer.parseInt(sc.nextLine());
            String s = sc.nextLine();
            String[] a = s.trim().split("\\s+");
            ArrayList<String> res = new ArrayList<>();
            for (String x : a){
                res.add(x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase());
            }
            if (choice == 1){
                System.out.print(res.get(res.size() - 1) + " ");
                for (int i = 0; i < res.size() - 1; i++){
                    System.out.print(res.get(i) + " ");
                }
                System.out.println("");
            } else {
                for (int i = 1; i < res.size(); i++){
                    System.out.print(res.get(i) + " ");
                }
                System.out.println(res.get(0)+ " ");
            }
        }
    }
}