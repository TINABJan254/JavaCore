package oop_codeptit.java_co_ban;

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
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.io.*;

public class test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            System.out.println(a);
        }
    }
}

class SinhVien {
    private String msv, ten, lop;
    private Date ngaysinh;
    private double gpa;
    
    public SinhVien(){
        this.ten = "";
        this.lop = "";
        this.gpa = 0;
        this.msv = "";
    }
    
    public SinhVien(int msv, String ten, String lop, String ngaysinh, double gpa) throws ParseException{
        this.msv = "B20DCCN" + String.format("%03d", msv);
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaysinh);
        this.gpa = gpa;
        ChuanHoa();
    }
    
    public void ChuanHoa(){
        String[] a = ten.trim().split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++){
            res += Character.toUpperCase(a[i].charAt(0));
            for (int j = 1; j < a[i].length(); j++){
                res += Character.toLowerCase(a[i].charAt(j));
            }
            res += " ";
        }
        res = res.trim();
        this.ten = res;
    }
    
    @Override
    public String toString(){
        return msv + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaysinh)
                + " " + String.format("%.2f", gpa);
    }
}

