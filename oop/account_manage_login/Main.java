package oop.account_manage_login;

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
        ArrayList<Account> arr = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            Account x = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            arr.add(x);
        }
        
        int Q = sc.nextInt();
        sc.nextLine();
        while (Q-- != 0){
            String userName = sc.nextLine();
            String pw = sc.nextLine();
            boolean check = false;
            for (Account x : arr){
                if (x.checkLogin(userName, pw)){
                    check = true;
                    break;
                }
            }
            
            if (check){
                System.out.println("Login Successful!");
            }
            else{
                System.out.println("Login Fail!");
            }
        }
    }
}
