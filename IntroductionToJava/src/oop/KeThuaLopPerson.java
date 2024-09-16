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

public class KeThuaLopPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            Student x = new Student(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.ChuanHoa();
            arr.add(x);
        }
        
        arr.sort(new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                if (o1.getSortedName() != o2.getSortedName())
                    return o1.getSortedName().compareTo(o2.getSortedName());
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (Student x : arr){
            System.out.println(x);
        }
    }
}

class Person{
    private String name, address, birth;
    
    public Person(){
        name = ""; address = ""; birth = "";
    }
    
    public Person(String name, String birth, String address){
        this.name = name;
        this.address = address;
        this.birth = birth;
    }
    
    public void ChuanHoa(){
        //name
        this.name = this.name.toLowerCase();
        String a[] = this.name.split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++){
            res += Character.toUpperCase(a[i].charAt(0));
            for (int j = 1; j < a[i].length(); j++){
                res += a[i].charAt(j);
            }
            res += " ";
        }
        res = res.trim();
        this.name = res;
        
        //birth
        StringBuilder sb = new StringBuilder(this.birth);
        if (sb.charAt(2) != '/')
            sb.insert(0, "0");
        if (sb.charAt(5) != '/')
            sb.insert(3, "0");
        this.birth = sb.toString();
    }
    
    public String getSortedName(){
        String res = "";
        String a[] = this.name.split("\\s+");
        res += a[a.length - 1] + " ";
        for (int i = 0; i < a.length - 1; i++)
            res += a[i] + " ";
        return res.trim();
    }
    
    @Override
    public String toString(){
        return this.name + " " + this.birth + " " + this.address;
    }
}

class Student extends Person{
    private String id, lop;
    private double gpa;
    
    public Student(){
        this.id = ""; this.lop = "";
        this.gpa = 0;
    }
    
    public Student(int id, String name, String birth, String address, String lop, double gpa){
        super(name, birth, address);
        this.id = String.format("%04d", id);
        this.lop = lop;
        this.gpa = gpa;
    }
    
    public String getId(){
        return this.id;
    }
    
    @Override
    public String toString(){
        return this.id + " " + super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
    
}
