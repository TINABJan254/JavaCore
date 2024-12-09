package j07078_tim_vi_tri_xau_con;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s1 = sc.nextLine().trim();
            String s2 = sc.nextLine().trim();
            
            int len = s2.length();
            for (int i = 0; i < s1.length() - len + 1; i++){
                if (s1.substring(i, i + len).equals(s2)){
                    System.out.print((i + 1) + " ");
                }
            }
            System.out.println("");
        }
        
    }
}
