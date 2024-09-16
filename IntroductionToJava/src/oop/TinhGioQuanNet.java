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

public class TinhGioQuanNet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Account> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            Account x = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        
        arr.sort(new Comparator<Account>(){
            @Override
            public int compare(Account o1, Account o2){
                if (o1.getPlayHour() != o2.getPlayHour())
                    return o2.getPlayHour() - o1.getPlayHour();
                return o2.getPlayMinute() - o1.getPlayHour();
            }
        });
        
        for (Account x : arr){
            System.out.println(x);
        }
        
    }
}

class Account{
    private String username, password, name;
    private String inTime, outTime;
    
    public Account(){
        username = "";
        password = "";
        name = "";
        inTime = "";
        outTime = "";
    }
    
    public Account(String username, String password, String name, String inTime, String outTime){
        this.username = username;
        this.password = password;
        this.name = name;
        this.inTime = inTime;
        this.outTime = outTime;
    }

    public String getInTime() {
        return inTime;
    }

    public String getOutTime() {
        return outTime;
    }
    
    public int getPlayHour(){
       int h = Integer.parseInt(outTime.substring(0, 2)) - Integer.parseInt(inTime.substring(0, 2));
       int m = Integer.parseInt(outTime.substring(3, outTime.length())) - Integer.parseInt(inTime.substring(3, inTime.length()));
       if (m < 0){
           --h;
           m = 60 + m;
       }
       return h;
    }
    
    public int getPlayMinute(){
        int m = Integer.parseInt(outTime.substring(3, outTime.length())) - Integer.parseInt(inTime.substring(3, inTime.length()));
        if (m < 0)
            m = 60 + m;
        return m;
    }
    
    @Override
    public String toString(){
        String res = username + " " + password + " " + name + " ";
        int h = getPlayHour();
        int m = getPlayMinute();
        res += h + " gio " + String.format("%02d", m) + " phut";
        return res;
    }
    
}
