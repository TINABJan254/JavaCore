package j07005_so_khac_nhau_trong_file_2;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        DataInputStream in = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] d = new int[1005];
        for (int i = 0; i < 100000; i++){
            int x = in.readInt();
            d[x]++;
        }
        
        for (int i = 0; i < 1000; i++){
            if (d[i] != 0){
                System.out.println(i + " " + d[i]);
            }
        }
    }
}
