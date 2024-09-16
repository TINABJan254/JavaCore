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

public class DanhSachMatHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            arr.add(x);
        }
        
        arr.sort(new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                if (o1.findProfit() != o2.findProfit())
                    return o2.findProfit() - o1.findProfit();
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (MatHang x : arr){
            System.out.println(x);
        }
    }
}

class MatHang{
    private String id, dvi, name;
    private int iPrice, ePrice;
    
    public MatHang(){
        name = "";
        id = "";
        dvi = "";
        iPrice = 0;
        ePrice = 0;
    }
    
    public MatHang(int id, String name, String dvi, int iPrice, int ePrice){
        this.id = "MH" + String.format("%04d", id);
        this.name = name;
        this.dvi = dvi;
        this.iPrice = iPrice;
        this.ePrice = ePrice;
    }

    public String getId() {
        return id;
    }
    
    public int findProfit(){
        return ePrice - iPrice;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + dvi + " " + iPrice + " " + ePrice + " " + findProfit();
    }
    
}