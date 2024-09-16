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

public class SapXepSinhVienTheoGPAvaMSV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien1> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            SinhVien1 x = new SinhVien1(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.ChuanHoaTen();
            x.ChuanHoaNsinh();
            arr.add(x);
        }
        
        arr.sort(new Comparator<>(){
            @Override
            public int compare(SinhVien1 o1, SinhVien1 o2){
                if (o1.getGpa() > o2.getGpa())
                    return -1;
                if (o1.getGpa() < o2.getGpa())
                    return 1;
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (int i = 0; i < arr.size(); i++)
            System.out.println(arr.get(i));

    }
}

class SinhVien1{
    private String ten, lop, nsinh, id;
    private double gpa;
    
    public SinhVien1(){
        ten =  "";
        lop = "";
        nsinh = "";
        gpa = 0;
    }
    
    public SinhVien1(int id, String ten, String lop, String nsinh, double gpa){
        this.id = "SV" + String.format("%03d", id);
        this.ten = ten;
        this.lop = lop;
        this.nsinh = nsinh;
        this.gpa = gpa;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNsinh() {
        return nsinh;
    }

    public void setNsinh(String nsinh) {
        this.nsinh = nsinh;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
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