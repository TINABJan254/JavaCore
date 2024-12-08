package j07041_liet_ke_cap_so_1;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Pair> listPair = (ArrayList<Pair>) os1.readObject();

//        ArrayList<Pair> listPair = new ArrayList<>();
//        listPair.add(new Pair(1, 2));
//        listPair.add(new Pair(2, 3));
//        listPair.add(new Pair(2, 3));
//        listPair.add(new Pair(4, 3));
//        listPair.add(new Pair(5, 6));
        
        HashSet<String> hs = new HashSet<>();
        ArrayList<Pair> res = new ArrayList<>();
        for (Pair pair : listPair){
            if (!hs.contains(pair.toString()) && pair.getFirst() < pair.getSecond()){
                res.add(pair);
                hs.add(pair.toString());
            }
        }
        
        Collections.sort(res);
        for (Pair pair : res){
            System.out.println(pair);
        }
        
    }
}
