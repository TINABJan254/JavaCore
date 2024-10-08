package thuc_hanh1;

import java.util.*;
import java.io.*;
import java.math.*;
        
public class TinhSoLong {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        BigInteger s = new BigInteger("0");
        while (sc.hasNext()){
            if (!sc.hasNextInt()){
                if (sc.hasNextLong()){
                    String tmp = sc.next();
                    s = s.add(new BigInteger(tmp));
                }
                else{
                    sc.next();
                }
            }
            else{
                sc.next();
            }
        }
        
        System.out.println(s);
    }
}
