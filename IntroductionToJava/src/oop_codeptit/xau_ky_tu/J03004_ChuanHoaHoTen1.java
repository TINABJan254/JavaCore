package oop_codeptit.xau_ky_tu;

import java.util.*;

public class J03004_ChuanHoaHoTen1 {
    
    public static String chuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()){
            String tu = st.nextToken();
            kq.append(Character.toUpperCase(tu.charAt(0)));
            for (int i = 1; i < tu.length(); i++){
                kq.append(Character.toLowerCase(tu.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            System.out.println(chuanHoa(s));
        }
    }
}
