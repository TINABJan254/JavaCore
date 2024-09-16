package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02009_XepHang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            a.add(new Pair(sc.nextInt(), sc.nextInt()));
        }
        
        Collections.sort(a, new Comparator<Pair>(){
            @Override
            public int compare(Pair o1, Pair o2){
                return o1.getFi() - o2.getFi();
            }
        });
        
        int res = a.get(0).getFi() + a.get(0).getSe();
        for (int i = 1; i < a.size(); i++){
            if (a.get(i).getFi() >= res){
                res = a.get(i).getFi() + a.get(i).getSe();
            }
            else{
                res += a.get(i).getSe();
            }
        }
        
        System.out.println(res);
    }
}

class Pair{
    private int fi, se;
    
    public Pair(int fi, int se){
        this.fi = fi;
        this.se = se;
    }

    public int getFi() {
        return fi;
    }

    public void setFi(int fi) {
        this.fi = fi;
    }

    public int getSe() {
        return se;
    }

    public void setSe(int se) {
        this.se = se;
    }
    
    
}