package BinaryIO_Practice;

import java.io.*;
import java.util.*;

public class GhepMa {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream input1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream input2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> a1 = (ArrayList<String>) input1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) input2.readObject();
        
        input1.close();
        input2.close();
        
        TreeSet<String> codes = new TreeSet<>();
        
        for (String s : a1) {
            for (Integer num : a2) {
                String code = s + String.format("%03d", num);
                codes.add(code);
            }
        }
        for (String code : codes) {
            System.out.println(code);
        }
         
    }
}
