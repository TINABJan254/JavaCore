package j08021_day_ngoac_dung_dai_nhat;

import java.util.*;

public class J08021 {
    
    public static int findLen(String s){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int res = -1;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                st.push(i);
            } else {
                st.pop();
                if (!st.empty()){
                    res = Math.max(res, i - st.peek());
                } else {
                    st.push(i);
                }
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            System.out.println(findLen(sc.next()));
        }
    }
}
