package oop_codeptit.java_co_ban;

import java.util.*;

public class J01024_SoTamPhan {
    
    public static boolean check(String s){
        for (char c : s.toCharArray()){
            if (c != '1' && c != '2' && c != '0'){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            if (check(s)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
