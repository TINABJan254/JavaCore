package bai6;

import java.util.*;

public class Main {
    
    private static String chuanHoa1(String s){
        String[] a = s.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        res.append(Character.toUpperCase(a[a.length - 1].charAt(0)));
        for (int j = 1; j < a[a.length - 1].length(); j++){
            res.append(a[a.length - 1].charAt(j));
        }
        res.append(" ");
        for (int i = 0; i < a.length - 1; i++){
            res.append(Character.toUpperCase(a[i].charAt(0)));
            for (int j = 1; j < a[i].length(); j++){
                res.append(a[i].charAt(j));
            }
            res.append(" ");
        }
        
        return res.toString().trim();
    }
    
    private static String chuanHoa2(String s){
        String[] a = s.trim().toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < a.length; i++){
            res.append(Character.toUpperCase(a[i].charAt(0)));
            for (int j = 1; j < a[i].length(); j++){
                res.append(a[i].charAt(j));
            }
            res.append(" ");
        }
        res.append(Character.toUpperCase(a[0].charAt(0)));
        for (int j = 1; j < a[0].length(); j++){
            res.append(a[0].charAt(j));
        }
        res.append(" ");
        
        return res.toString().trim();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0){
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1){
                System.out.println(chuanHoa1(sc.nextLine()));;
            } else {
                System.out.println(chuanHoa2(sc.nextLine()));
            }
        }
    }
}