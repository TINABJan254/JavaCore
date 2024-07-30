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

public class ThuNhapCuaGiaovien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiaoVien x = new GiaoVien(sc.nextLine(), sc.nextLine(), sc.nextInt());
        x.getHeSo();
        x.inTT();
        System.out.println(x.getLuong());
    }
}

class GiaoVien{
    private String ma, ten;
    private int luongCoBan;
    private int heSo;
    
    GiaoVien(){
        ma = "";
        ten = "";
        luongCoBan = 0;
    }
    
    GiaoVien(String ma, String ten, int luongCoBan){
        this.ma = ma;
        this.ten = ten;
        this.luongCoBan = luongCoBan;
    }
    
    public void inTT(){
        System.out.print(ma + " " + ten + " " + heSo + " ");
    }
    
    public void getHeSo(){
        heSo = Integer.parseInt(ma.substring(2));
    }
    
    public long getLuong(){
        String ChucVu = ma.substring(0, 2);
        long res = 0;
        if (ChucVu.compareTo("HT") == 0)
            res += 2000000;
        else if (ChucVu.compareTo("HP") == 0)
            res += 900000;
        else if (ChucVu.compareTo("GV") == 0)
            res += 500000;
        
        res += 1L*heSo*luongCoBan;
        return res;
    }
    
    
}