package j07015_so_nguyen_to_trong_file_nhi_phan;

import java.util.*;
import java.io.*;

public class J07015 {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n > 1;
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        int[] d = new int[10005];
        for (Integer x : a) {
            if (isPrime(x)){
                d[x]++;
            }
        }
        for (int i = 0; i < 10005; i++) {
            if (d[i] != 0){
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
