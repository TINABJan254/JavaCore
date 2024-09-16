package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02017_ThuGonDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (!st.empty() && ((x + st.peek()) % 2 == 0)){
                    st.pop();
            }
            else{
                st.push(x);
            }
        }
        System.out.println(st.size());
    }
}
