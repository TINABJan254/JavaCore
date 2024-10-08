package j07040_liet_ke_theo_thu_tu_xuat_hien;

import java.util.*;
import java.io.*;

public class J07040 {
    public static void main(String[] args) throws ClassNotFoundException, IOException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> tmp = (ArrayList<String>)ois.readObject();
        ArrayList<String> a = new ArrayList<>();
        for (String x : tmp){
            Scanner sc2 = new Scanner(x);
            while (sc2.hasNext()){
                a.add(sc2.next().toLowerCase());
            }
        }
        
        HashSet<String> hs = new HashSet<>();
        while (sc.hasNext()){
            String token = sc.next().toLowerCase();
            if (a.contains(token) && !hs.contains(token)){
                System.out.println(token);
                hs.add(token);
            }
        }
    }
}
