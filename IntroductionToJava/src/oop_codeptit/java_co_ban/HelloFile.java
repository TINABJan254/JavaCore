package oop_codeptit.java_co_ban;

import java.util.*;
import java.io.*;

public class HelloFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("Hello.txt"));
        while (sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
    }
}
