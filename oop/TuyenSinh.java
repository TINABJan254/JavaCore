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

public class TuyenSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien3 x = new SinhVien3(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        x.displayInf();
    }
}

class SinhVien3{
    private String ten, ma;
    private double toan, ly, hoa;
    
    public SinhVien3(){
        ten = "";
        ma = "";
        toan = 0;
        ly = 0;
        hoa = 0;
    }
    
    public SinhVien3(String ma, String ten, double toan, double ly, double hoa){
        this.ten = ten;
        this.ma = ma;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    
    public String findKhuVuc(){
        return ma.substring(0, 3);
    }
    
    public double findTongDiem(){
        double res = 0;
        String kv = findKhuVuc();
        if (kv.equals("KV1"))
            res += 0.5;
        else if (kv.equals("KV2"))
            res += 1.0;
        else
            res += 2.0;
        res += toan + ly + hoa;
        return res;
    }
    
    public String findStatus(){
        if (findTongDiem() >= 24.0)
            return "TRUNG TUYEN";
        return "TRUOT";
    }
    
    public void displayInf(){
        System.out.print(ma + " " + ten + " " + ma.charAt(2) + " ");
        double sum = findTongDiem();
        if (sum - (int)sum == 0D)
            System.out.printf("%.0f %s\n", sum, findStatus());
        else
            System.out.printf("%.1f %s\n", sum, findStatus());
    }
    
}
