package j07014_hop_giao_hai_file_van_ban;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set;
    
    public WordSet(){
        this.set = new TreeSet<>();
    }
    
    public WordSet(String pathFile) throws FileNotFoundException{
        this.set = new TreeSet<>();
        Scanner sc = new Scanner(new File(pathFile));
        while (sc.hasNext()){
            this.set.add(sc.next().toLowerCase());
        }
    }
    
    public WordSet union(WordSet other){
        WordSet res = new WordSet();
        for (String word : this.set){
            res.set.add(word);
        }
        
        for (String word: other.set){
            res.set.add(word);
        }
        return res;
    }
    
    public WordSet intersection(WordSet other){
        WordSet res = new WordSet();
        for (String word : other.set){
            if (this.set.contains(word)){
                res.set.add(word);
            }
        }
        return res;
    }
    
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        for (String word : this.set){
            res.append(word).append(" ");
        }
        return res.toString().trim();
    }
}
