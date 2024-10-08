package thuc_hanh1;

import java.util.*;
import java.io.*;

public class GiaTriNhiPhan {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        
        for(String x : a){
            String res = "";
            for (int i = 0; i < x.length(); i++){
                if (x.charAt(i) == '0' || x.charAt(i) == '1'){
                    res += x.charAt(i);
                }
            }
            long s = 0;
            String tmp = new StringBuilder(res).reverse().toString();
            for (int i = 0; i < tmp.length(); i++){
                if (tmp.charAt(i) == '0'){
                    s += 0;
                }
                else{
                    s += (long)Math.pow(2, i);
                }
            }
            System.out.println(res + " " + s);
        }
    }
}
