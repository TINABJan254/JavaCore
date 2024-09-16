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

public class LopPhanSo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();
        while (TC-- != 0){
            PhanSo a = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo b = new PhanSo(sc.nextLong(), sc.nextLong());
            PhanSo c = new PhanSo();
            c = a.addWith(b);
            c = c.multiplyWith(c);
            PhanSo d = a.multiplyWith(b);
            d = d.multiplyWith(c);
            System.out.println(c + " " + d);
        }
        
    }
}

class PhanSo{
    private long tu;
    private long mau;
    
    public PhanSo(){
        tu = 0;
        mau = 0;
    }
    
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    
    private long gcd(long a,long b){
        while(b!=0){
            long t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    private long lcm(long a, long b){
        return a/gcd(a,b)*b;
    }
    
     public void rutGon(){
        long k = gcd(this.tu, this.mau);
        this.tu /= k;
        this.mau /= k;
    }
    
    public PhanSo addWith(PhanSo b){
        long mau1 = this.mau * b.mau;
        long tu1  = this.tu * b.mau + b.tu * this.mau;
        PhanSo res = new PhanSo(tu1, mau1);
        res.rutGon();
        return res;
    }
    
    public PhanSo multiplyWith(PhanSo b){
        PhanSo res = new PhanSo();
        res.tu = this.tu * b.tu;
        res.mau = this.mau * b.mau;
        res.rutGon();
        return res;
    }
    
    @Override
    public String toString(){
        return tu+"/"+mau;
    }
    
}