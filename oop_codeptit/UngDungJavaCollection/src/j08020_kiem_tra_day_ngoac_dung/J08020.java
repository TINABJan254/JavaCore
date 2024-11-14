package j08020_kiem_tra_day_ngoac_dung;

import java.util.*;

public class J08020 {
    
    public static boolean check(String s){
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '[' || c == '{' || c == '('){
                st.push(c);
            }
            else {
                if (st.empty()){
                    return false;
                }
                if (c == ')' && st.peek() != '('){
                    return false;
                }
                if (c == '}' && st.peek() != '{'){
                    return false;
                }
                if (c == ']' && st.peek() != '['){
                    return false;
                }
                st.pop();
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            if (check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
