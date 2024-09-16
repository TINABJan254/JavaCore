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

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        C toila = new C();
        System.out.println("hi");
        toila.say();
    }
}

class T{
    private int x;
    private int y;
  
    T(){
        System.out.println("Hehe");
        x = 1;
        y = 10;
    }
    
    public void say(){
        System.out.println("hello you");
    }
    
    T(String x){
        System.out.println("Haha");
    }
    
}

class C extends T{
    private String a;
    
    public void say(){
        System.out.println("Hello cai thang kia");
    }
    
    C(){
        System.out.println("hoho");
    }
    
}

/*
5 2
B17DTCN001
Nguyen Chi  Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1
*/