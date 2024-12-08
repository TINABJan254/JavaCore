package bai58;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while (sc.hasNext()){
            if (sc.hasNextLong()){
                if (!sc.hasNextInt()){
                    res += sc.nextLong();
                }
                else {
                    sc.next();
                }
            } else {
                sc.next();
            }
        }
        System.out.println(res);
    }
}
