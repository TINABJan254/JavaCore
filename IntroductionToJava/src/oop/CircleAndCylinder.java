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

public class CircleAndCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cylinder> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            String color = sc.next();
            double radius = sc.nextDouble();
            double height = sc.nextDouble();
            arr.add(new Cylinder(radius, height, color));
        }
        
        arr.sort(new Comparator<Cylinder>(){
            @Override
            public int compare(Cylinder o1, Cylinder o2){
                if (o1.getVolume() > o2.getVolume())
                    return -1;
                if (o1.getVolume() < o2.getVolume())
                    return 1;
                return o1.getColor().compareTo(o2.getColor());
            }
        });
        
        for (Cylinder x : arr){
            System.out.println(x);
        }
    }
}

class Circle{
    private double radius;
    private String color;
    
    public Circle(){
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        return 3.14 * radius * radius;
    }
    
    
}

class Cylinder extends Circle{
    private double height;
    
    public Cylinder(){
        height = 1.0;
    }
    
    public Cylinder(double radius){
        super(radius);
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double getVolume(){
        return super.getArea() * height;
    }
    
    @Override
    public String toString(){
        return "Color : " + super.getColor() + "\nHeight : " + String.format("%.2f", height)
                + "\nRadius : " + String.format("%.2f", super.getRadius()) + "\nVolume : " + String.format("%.2f", getVolume())
                + "\n-------------------";
    }
    
}