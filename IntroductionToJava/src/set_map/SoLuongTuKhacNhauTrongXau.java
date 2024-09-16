package set_map;

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

public class SoLuongTuKhacNhauTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> se = new TreeSet<>();
        while (sc.hasNext()){
            String s = sc.next();
            se.add(s);
        }
        System.out.println(se.size());
        System.out.print(se.first() + " " + se.last());
    }
}
