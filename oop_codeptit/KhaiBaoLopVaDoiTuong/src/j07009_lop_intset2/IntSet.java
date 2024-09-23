package j07009_lop_intset2;

import java.util.*;

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
    
    public IntSet union(IntSet other){
        IntSet res = new IntSet();
        
        for (Integer x : this.set){
            res.set.add(x);
        }
        for (Integer x : other.set){
            res.set.add(x);
        }
        
        return res;
    }
    
    public IntSet intersection(IntSet other){
        IntSet res = new IntSet();
        
        for (Integer x : this.set){
            if (other.set.contains(x)){
                res.set.add(x);
            }
        }
        
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        for (Integer x : set){
            res += x + " ";
        }
        return res.trim();
    }
}
