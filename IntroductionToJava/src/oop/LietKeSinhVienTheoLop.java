package oop;

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

public class LietKeSinhVienTheoLop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SV> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            SV x = new SV(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            x.ChuanHoaTen();
            arr.add(x);
        }

        int Q = sc.nextInt();
        sc.nextLine();
        while (Q-- != 0) {
            String x = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN LOP %s :\n", x);
            for (SV tmp : arr) {
                if (tmp.getLop().equals(x)) {
                    System.out.println(tmp);
                }
            }
        }
    }
}

class SV {

    private String msv, ten, lop, email;

    public SV() {
        msv = "";
        ten = "";
        lop = "";
        email = "";
    }

    public SV(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
    }

    public String getMsv() {
        return msv;
    }

    public String getLop() {
        return lop;
    }

    public void ChuanHoaTen() {
        String res = "";
        ten = ten.toLowerCase();
        String[] a = ten.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            res += Character.toUpperCase(a[i].charAt(0));
            for (int j = 1; j < a[i].length(); j++) {
                res += a[i].charAt(j);
            }
            res += " ";
        }
        ten = res.trim();
    }

    @Override
    public String toString() {
        return msv + " " + ten + " " + lop + " " + email;
    }

}
