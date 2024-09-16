package oop_codeptit.xau_ky_tu;

import java.util.*;
import java.math.*;

public class J03006_SoDep1 {
    
    public static boolean check(String s){
        String tmp = (new StringBuilder(s)).toString();
        if (!tmp.equals(s)){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            if ((s.charAt(i) - '0') % 2 != 0){
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
