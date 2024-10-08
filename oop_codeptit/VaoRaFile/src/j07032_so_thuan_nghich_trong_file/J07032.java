package j07032_so_thuan_nghich_trong_file;

import java.util.*;
import java.io.*;

public class J07032 {
    
    public static boolean check(int n){
        String tmp = "" + n;
        String x = new StringBuilder(tmp).reverse().toString();
        if (!tmp.equals(x)){
            return false;
        }
        for (int i = 0; i < tmp.length(); i++){
            char c = tmp.charAt(i);
            if ((c - '0') % 2 == 0){
                return false;
            }
        }
        return (tmp.length() % 2 != 0 && tmp.length() > 1);
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();
        
        int[] d1 = new int[1000005];
        int[] d2 = new int[1000005];
        for (Integer x : a){
            if (check(x)){
                d1[x]++;
            }
        }
        for (Integer x : b){
            if (check(x)){
                d2[x]++;
            }
        }
        
        int cnt = 0;
        for (int i = 10; i <= 1000000; i++){
            if (d1[i] > 0 && d2[i] > 0){
                System.out.println(i + " " + (d1[i] + d2[i]));
                ++cnt;
            }
            if (cnt == 10){
                break;
            }
        }
    }
}
