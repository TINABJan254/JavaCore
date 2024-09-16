package single_dimensional_arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> c1 = new ArrayList<>();
        int[] a = {1, 2, 2, 2, 4, 6, 9};
        //         0, 1, 2, 3, 4, 5, 6
//        for (int i = 0; i < a.length; i++){
//            c1.add(a[i]);
//        }
//        
////        c1.sort(new Comparator<Integer>(){
////            @Override
////            public int compare(Integer o1, Integer o2) {
////                if (o1 < o2)
////                    return -1;
////                return 1;
////            }
////        });
//        Collections.sort(c1);
//        
//          
//        
//        Object[] b = c1.toArray();
//        
//        for (Object x : b)
//            System.out.print(x + " ");
//        System.out.println("");
//        
//        c1.forEach((x) -> System.out.print(x + " "));
        System.out.println(Arrays.binarySearch(a, 2));
        Set<Integer> se = new HashSet<>();
        
    }
}
