package string;

import java.math.BigInteger;
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
import java.util.TreeMap;

public class XauConCacKyTuLienTiepKhacNhau {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        String tmp_ans = "";
        s += s.charAt(s.length() - 1);
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                tmp_ans += s.charAt(i);
            }
            else{
                tmp_ans += s.charAt(i);
                if (tmp_ans.length() > ans.length()){
                    ans = tmp_ans;
                }
                else if (tmp_ans.length() == ans.length()){
                    if (tmp_ans.compareTo(ans) == 1)
                        ans = tmp_ans;
                }
                tmp_ans = "";
            }
        }
        System.out.println(ans);
    }
}
