package j08022_phan_tu_ben_phai_dau_tien_lon_hon;

import java.util.*;

public class J08022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            int[] d = new int[n];
            Stack<Integer> st = new Stack<>();
            for (int i = 0; i < n; i++){
                while (!st.empty() && a[i] > a[st.peek()]){
                    d[st.peek()] = a[i];
                    st.pop();
                }
                st.push(i);
            }
            
            while (!st.empty()){
                d[st.pop()] = -1;
            }
            
            //print result
            for (int i = 0; i < n; i++){
                System.out.print(d[i] + " ");
            }
            System.out.println("");
        }
    }
}
