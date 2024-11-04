package thuchanh2.bai2;

import java.util.*;

public class WordSet {
    private TreeSet<String> set;
    
    public WordSet(){
        set = new TreeSet<>();
    }
    
    public WordSet(String line){
        set = new TreeSet<>();
        Scanner lineScan = new Scanner(line);
        while (lineScan.hasNext()){
            set.add(lineScan.next().toLowerCase());
        }
    }
    
    public WordSet union(WordSet other){
        WordSet res = new WordSet();
        for (String word : this.set){
            res.set.add(word);
        }
        
        for (String word : other.set){
            res.set.add(word);
        }
        
        return res;
    }
    
    public WordSet intersection(WordSet other){
        WordSet res = new WordSet();
        
        for (String word : this.set){
            if (other.set.contains(word)){
                res.set.add(word);
            }
        }
        
        return res;
    }
    
    
    @Override
    public String toString(){
        String res = "";
        for (String word : this.set){
            res += word + " ";
        }
        return res.trim();
    }
}
