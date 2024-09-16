package oop.lop_set1;

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

public class IntSet {
    private TreeSet<Integer> set;
    
    public IntSet(){
        set = new TreeSet<>();
    }
    
    public IntSet(int[] a){
        set = new TreeSet<>();
        for (int i = 0; i < a.length; i++){
            set.add(a[i]);
        }
    }
    
    public IntSet intersection(IntSet other){
        IntSet res = new IntSet();
        for (int x : this.set){
            if (other.set.contains(x))
                res.set.add(x);
        }
        return res;
    }
    
    public IntSet union(IntSet other){
        IntSet res = new IntSet();
        for (int x : this.set)
            res.set.add(x);
        for (int x : other.set)
            res.set.add(x);
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        for (int x : this.set){
            res += x + " ";
        }
        res.trim();
        return res;
        
    }
}
