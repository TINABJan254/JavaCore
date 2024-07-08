package single_dimensional_arrays;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class MangChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chan = 0, le = 0;
        int n;
        while(sc.hasNext()){
            n = sc.nextInt();
            if (n % 2 == 0)
                ++chan;
            else
                ++le;
        }
        
        if (chan > le)
            System.out.println("CHAN\n");
        else
            System.out.println("LE\n");
    }
}
