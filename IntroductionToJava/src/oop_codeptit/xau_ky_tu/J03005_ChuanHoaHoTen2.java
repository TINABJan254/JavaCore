package oop_codeptit.xau_ky_tu;

import java.util.*;
import java.math.*;

public class J03005_ChuanHoaHoTen2 {
    
    public static String chuanHoa(String s){
        s = s.trim();
        s = s.toLowerCase();
        String a[] = s.split("\\s++");
        String res = "";
        for (int i = 1; i < a.length; i++){
            res += Character.toUpperCase(a[i].charAt(0));
            for (int j = 1; j < a[i].length(); j++){
                res += a[i].charAt(j);
            }
            if (i == a.length - 1){
                res += ", ";
            }
            else{
                res += " ";
            }
        }
        for (int i = 0; i < a[0].length(); i++){
            res += Character.toUpperCase(a[0].charAt(i));
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}
