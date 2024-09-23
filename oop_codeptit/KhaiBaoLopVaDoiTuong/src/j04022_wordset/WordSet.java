package j04022_wordset;

import java.util.*;

public class WordSet {
    private TreeSet<String> set;
    
    public WordSet(){
        set = new TreeSet<>();
    }
    
    public WordSet(String s){
        set = new TreeSet<>();
        String[] a = s.split("\\s+");
        for (String x : a){
            set.add(x.toLowerCase());
        }
    }
    
    public WordSet union(WordSet other){
        WordSet res = new WordSet();
        
        for (String x : this.set){
            res.set.add(x);
        }
        for (String x : other.set){
            res.set.add(x);
        }
        
        return res;
    }
    
    public WordSet intersection(WordSet other){
        WordSet res = new WordSet();
        
        for (String x : this.set){
            if (other.set.contains(x)){
                res.set.add(x);
            }
        }
        
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        for (String x : set){
            res += x + " ";
        }
        return res.trim();
    }
}
