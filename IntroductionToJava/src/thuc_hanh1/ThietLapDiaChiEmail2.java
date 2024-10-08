package thuc_hanh1;

import java.util.*;
import java.io.*;

public class ThietLapDiaChiEmail2 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        HashSet<String> hs = new HashSet<>();
        HashMap<String, Integer> hm = new HashMap<>();
        while (sc.hasNext()){
            String line = sc.nextLine();
            line = line.trim().toLowerCase();
            Scanner sc2 = new Scanner(line);
            String tmp = " ";
            while (sc2.hasNext()){
                tmp += sc2.next() + " ";
            }
            tmp = tmp.trim();
            if (!hs.contains(tmp)){
                hs.add(tmp);
                String[] a = line.split("\\s+");
                String email = a[a.length - 1];
                for (int i = 0; i < a.length - 1; i++){
                    email += a[i].charAt(0);
                }
                if (hm.containsKey(email)){
                    hm.put(email, hm.get(email) + 1);
                    email += hm.get(email);
                }
                else{
                    hm.put(email, 1);
                }
                System.out.println(email + "@ptit.edu.vn");
            }
        }
    }
}
