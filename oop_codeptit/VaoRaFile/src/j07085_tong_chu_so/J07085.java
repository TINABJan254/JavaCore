package j07085_tong_chu_so;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class J07085 {
    
    private static int sumDigit(String s){
        int res = 0;
        for (char c : s.toCharArray()){
            res += c - '0';
        }
        return res;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>)os1.readObject();
        for (String x : a){
            StringBuilder res = new StringBuilder();
            for (int i = 0; i < x.length(); i++){
                if (Character.isDigit(x.charAt(i))){
                    res.append(x.charAt(i));
                }
            }
            System.out.println(new BigInteger(res.toString()).toString() + " " + sumDigit(res.toString()));
        }
    }
}
