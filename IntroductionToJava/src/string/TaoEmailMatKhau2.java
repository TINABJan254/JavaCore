package string;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TaoEmailMatKhau2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++){
            String inf = sc.nextLine();
            inf = inf.toLowerCase();
            String[] a = inf.split("\\s+");
            //user_name
            String user_name = "";
            user_name += a[a.length - 2];
            for (int j = 0; j < a.length - 2; j++){
                user_name += a[j].charAt(0);
            }
            if (mp.containsKey(user_name)){
                mp.put(user_name, mp.get(user_name) + 1); 
                //note: phải tăng trước rồi mới lấy tránh trường hợp thay đổi user_name rồi mới put trở lại map
                user_name += mp.get(user_name);
            }
            else{
                mp.put(user_name, 1);
            }
            //password
            String password = "";
            password += (Integer.parseInt(a[a.length - 1].substring(0, 2)) + "");
            password += (Integer.parseInt(a[a.length - 1].substring(3, 5)) + "");
            password += (Integer.parseInt(a[a.length - 1].substring(6)));
            
            System.out.println(user_name + "@xyz");
            System.out.println(password);
        }
        
    }
}
