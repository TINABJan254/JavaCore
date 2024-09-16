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

public class SinhVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien7> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            SinhVien7 x = new SinhVien7(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            arr.add(x);
        }
        
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));   
    }
}

class SinhVien7{
    private String ten, lop, nsinh, id;
    private double gpa;
    
    public SinhVien7(){
        ten =  "";
        lop = "";
        nsinh = "";
        gpa = 0;
    }
    
    public SinhVien7(int id, String ten, String lop, String nsinh, double gpa){
        this.id = "SV" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.nsinh = nsinh;
        this.gpa = gpa;
    }
    
    public void ChuanHoaTen(){
        String[] a = ten.split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++){
            res += Character.toUpperCase(a[i].charAt(0));
            for (int j = 1; j < a[i].length(); j++)
                res += Character.toLowerCase(a[i].charAt(j));
            res += " ";
        }
        res = res.trim();
        this.ten = res;
    }
    
    public void ChuanHoaNsinh(){
        StringBuilder sb = new StringBuilder(nsinh);
        if (sb.charAt(2) != '/')
            sb.insert(0, "0");
        if (sb.charAt(5) != '/')
            sb.insert(3, "0");
        this.nsinh = sb.toString();
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + lop + " " + nsinh + " " + String.format("%.2f", gpa);
    }
}
