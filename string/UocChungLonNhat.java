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

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String m = sc.next();
        String n = sc.next();
        BigInteger a = new BigInteger(m);
        BigInteger b = new BigInteger(n);
        System.out.println(a.gcd(b));
    }
}
