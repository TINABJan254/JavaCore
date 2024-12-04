package thuchanh3;

import java.util.*;
import java.io.*;

public class bai1 {
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
//        ArrayList<String> a = new ArrayList<>();
//        a.add("Java Programming 5 has 371 pages.");
//        a.add("More than 70 % …");
        TreeSet<Integer> ts = new TreeSet<>();
        for (String x : a){
            Scanner sc = new Scanner(x);
            while (sc.hasNext()){
                try {
                    int num = Integer.parseInt(sc.next());
                    ts.add(num);
                }
                catch (NumberFormatException e) {   
                }
            }
        }
        
        for (int x : ts){
            System.out.println(x);
        }
    }
}
