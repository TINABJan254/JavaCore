package j07002_tinh_tong;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long s = 0;
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                s += sc.nextInt();
            }
            else{
                sc.next();
            }
        }
        System.out.println(s);
    }
}