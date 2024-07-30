package oop.lop_set2;

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

public class WordSet {
    private TreeSet<String> set;
    
    public WordSet(){
        set = new TreeSet<>();
    }
    
    public WordSet(String s){
        set = new TreeSet<>();
        String[] a = s.split("\\s+");
        for (int i = 0; i < a.length; i++)
            this.set.add(a[i]);
    }
    
    public WordSet union(WordSet other){
        WordSet res = new WordSet();
        for (String x : this.set)
            res.set.add(x);
        for (String x : other.set)
            res.set.add(x);
        return res;
    }
    
    public WordSet intersection(WordSet other){
        WordSet res = new WordSet();
        for (String x : this.set){
            if (other.set.contains(x))
                res.set.add(x);
        }
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        for (String x : this.set)
            res += x + " ";
        return res.trim();
    }
    
}
