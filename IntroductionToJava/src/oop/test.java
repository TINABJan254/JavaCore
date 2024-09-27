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
        System.out.println("Hello");
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
3
Nguyen Manh Son
Cong nghe phan mem
Vu Hoai Nam
Khoa hoc may tinh
Dang Minh Tuan
An toan thong tin
*/