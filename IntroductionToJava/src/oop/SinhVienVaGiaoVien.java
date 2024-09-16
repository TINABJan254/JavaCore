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

public class SinhVienVaGiaoVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr2 = new ArrayList<>();
        ArrayList<Teacher> arr1 = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            String birth = sc.nextLine();
            String address = sc.nextLine();
            if (id.substring(0, 2).equals("GV")){
                String department = sc.nextLine();
                double salary = sc.nextDouble();
                Teacher x = new Teacher(id, name, birth, address, department, salary);
                x.ChuanHoa();
                arr1.add(x);
            }
            else{
                String lop = sc.nextLine();
                double gpa = sc.nextDouble();
                Student x = new Student(id, name, birth, address, lop, gpa);
                x.ChuanHoa();
                arr2.add(x);
            }
        }
        System.out.println("DANH SACH GIAO VIEN :");
        for (Teacher x : arr1){
            System.out.println(x);
        }
        System.out.println("DANH SACH SINH VIEN :");
        for (Student x : arr2){
            System.out.println(x);
        }
    }
    
}

class Person{
    private String id, name, address, birth;
    
    public Person(){
        id = ""; name = ""; address = ""; birth = "";
    }
    
    public Person(String id, String name, String birth, String address){
        this.id = id;
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
    
    @Override
    public String toString(){
        return id + " " + name + " " + birth + " " + address;
    }
}

class Student extends Person{
    private String lop;
    private double gpa;
    
    public Student(){
        lop = ""; gpa = 0;
    }

    public Student(String id, String name, String birth, String address, String lop, double gpa){
        super(id, name, birth, address);
        this.lop = lop;
        this.gpa = gpa;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + lop + " " + String.format("%.2f", gpa);
    }
}

class Teacher extends Person{
    private String department;
    private double  salary;
    
    public Teacher(){
        department = "";
        salary = 0;
    }
    
    public Teacher(String id, String name, String birth, String address, String department, double salary){
        super(id, name, birth, address);
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String toString(){
        return super.toString() + " " + department + " " + String.format("%.1f", salary);
    }
}

