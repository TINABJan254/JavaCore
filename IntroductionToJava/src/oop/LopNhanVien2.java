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

public class LopNhanVien2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien x = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        x.chuanHoa();
        x.inTT();
    }
}

class NhanVien{
    private String ten, mnv, gtinh, nsinh, dchi, ms, nHD;
    
    NhanVien(){};
    NhanVien(String ten, String gtinh, String nsinh, String dchi, String ms, String nHD){
        this.ten = ten;
        this.gtinh = gtinh;
        this.nsinh = nsinh;
        this.dchi = dchi;
        this.ms = ms;
        this.nHD = nHD;
        this.mnv = "00001";
    }
    
    public void chuanHoa(){
        //chuan hoa ten
        String res = "";
        ten = ten.toLowerCase();
        String[] a = ten.split(" ");
        for (int i = 0; i < a.length; i++){
            res += Character.toUpperCase(a[i].charAt(0));
            for (int j = 1; j < a[i].length(); j++)
                res += a[i].charAt(j);
            res += " ";
        }
        res = res.trim();
        ten = res;
        
        //chuan hoa ngay sinh
        StringBuilder sb = new StringBuilder(nsinh);
        if (sb.charAt(2) != '/')
            sb.insert(0, "0");
        if (sb.charAt(5) != '/')
            sb.insert(3, "0");
        nsinh = sb.toString();
        
        //chuan hoa ngay ky hop dong
        StringBuilder sb2 = new StringBuilder(nHD);
        if (sb2.charAt(2) != '/')
            sb2.insert(0, "0");
        if (sb2.charAt(5) != '/')
            sb2.insert(3, "0");
        nHD = sb2.toString();
    }
    
    public void inTT(){
        System.out.print(mnv + " " + ten + " " + nsinh);
        System.out.println(" " + dchi + " " + ms + " " + nHD);
    }
}
