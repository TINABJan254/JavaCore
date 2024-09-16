package oop.book_author_composition;

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

public class Book {
    private String name;
    private Author author;
    private double price;
    int qty;    
    
    public Book(){
        name = "";
        author = new Author();
        price = 0;
        qty = 0;
    }
    
    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    
    public Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
    @Override
    public String toString(){
        return "Book Details :\n" + name + "\n" + String.format("%d", Math.round(price)) + "\n" + qty + "\n" + author;
    }
    
}
