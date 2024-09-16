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

public class LopSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
        x.inThongTin();
    }
}

class SinhVien {

    private String ten, nsinh;
    private float m1, m2, m3;

    public SinhVien() {
        ten = "";
        nsinh = "";
        m1 = 0; m2 = 0; m3 = 0;
    }
    
    public SinhVien(String ten, String nsinh, float m1, float m2, float m3){
        this.ten = ten;
        this.nsinh = nsinh;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    
    public void inThongTin(){
        System.out.printf("%s %s %.1f\n", ten, nsinh, (m1 + m2 + m3));
    }
}
