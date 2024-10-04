package j07022_loai_bo_so_nguyen;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()){
            if (sc.hasNextInt()){
                sc.next();
            }
            else{
                a.add(sc.next());
            }
        }
        
        Collections.sort(a);
        for (String x : a){
            System.out.print(x + " ");
        }
    }
}
