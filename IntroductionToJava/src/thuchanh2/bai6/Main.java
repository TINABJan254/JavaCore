package thuchanh2.bai6;

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        ArrayList<BigInteger> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            a.add(new BigInteger(sc.next()));
        }
        
        BigInteger minE = a.get(0), maxE = a.get(0), s = a.get(0);
        for (int i = 1; i < n; i++){
            if (a.get(i).compareTo(maxE) == 1){
                maxE = a.get(i);
            }
            if (a.get(i).compareTo(minE) == -1){
                minE = a.get(i);
            }
            s = s.add(a.get(i));
        }
        System.out.printf("%s\n%s\n%s", minE.toString(), maxE.toString(), s.toString());
    }
}
