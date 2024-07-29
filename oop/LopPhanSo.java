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

public class LopPhanSo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PS x = new PS(sc.nextInt(), sc.nextInt());
        x.rutGon();
        x.inPS();
    }
}

class PS{
    private int tu, mau;
    
    PS(){};
    
    PS(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
    
    public void rutGon(){
        int uc = gcd(tu, mau);
        tu /= uc;
        mau /= uc;
    }
    
    public int gcd(int a, int b){
        while (b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public void inPS(){
        System.out.println(tu + "/" + mau);
    }
}