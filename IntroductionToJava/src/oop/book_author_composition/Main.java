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

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Book> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            String bookName = sc.nextLine();
            double bookPrice = sc.nextDouble();
            int bookQty = sc.nextInt();
            sc.nextLine();
            Author author = new Author(sc.nextLine(), sc.nextLine(), sc.next().charAt(0));
            
            Book x = new Book(bookName, author, bookPrice, bookQty);
            arr.add(x);
        }
        
        arr.sort(new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2){
                if (o1.getPrice() > o2.getPrice())
                    return -1;
                else if (o1.getPrice() < o2.getPrice())
                    return 1;
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        for (Book x : arr){
            System.out.print(x);
        }
        
    }
    
}
