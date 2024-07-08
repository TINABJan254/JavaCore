package single_dimensional_arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SapXepChanLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            Integer x = sc.nextInt();
            list.add(x);
        }
        
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                if ((o1 % 2 != 0) && (o2 % 2 == 0))
                    return -1;
                if ((o1 % 2 == 0) && (o2 % 2 != 0))
                    return 1;
                if ((o1 % 2 == 0) && (o2 % 2 == 0))
                    return o1 - o2;                    
                return o2 - o1;
            }   
        });
        
        for (Integer x : list){
            System.out.print(x + " ");
        }
    }
}
/*
Số lẻ đứng trước và giảm dần
Số chẵn đứng sau và tăng dần
*/