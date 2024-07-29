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

public class LopSinhVien3 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        SinhVien x = new SinhVien("SV001", sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
        x.ChuanHoa();
        String res = x.toString();
        System.out.println(res);
    }
}

class SinhVien{
    private String msv, ten, lop, nsinh;
    private double gpa;
    
    SinhVien(){
        msv = "";
        ten = "";
        lop = "";
        nsinh = "";
        gpa = 0;
    }
    
    SinhVien(String msv, String ten, String lop, String nsinh, double gpa){
        this.msv = msv;
        this.ten = ten;
        this.nsinh = nsinh;
        this.lop = lop;
        this.gpa = gpa;
    }   
    
    public void ChuanHoa(){
        StringBuilder s =  new StringBuilder(nsinh);
        if (s.charAt(2) != '/'){
            s.insert(0, "0");
        }
        if (s.charAt(5) != '/'){
            s.insert(3, "0");
        }
        nsinh = s.toString();
    }
    
    public String toString(){ //gop infor lai thanh 1 string
        return msv + " " + ten + " " + lop + " " + String.format("%.1f", gpa);
    }
}