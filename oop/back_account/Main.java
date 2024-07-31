package oop.back_account;

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
        Account[] accountList = new Account[n];
        for (int i = 0; i < n; i++){
            sc.nextLine();
            accountList[i] = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int Q = sc.nextInt();
        while (Q-- != 0){
            sc.nextLine();
            String transaction = sc.nextLine();
            if (transaction.equals("deposit")){
                String X = sc.next();
                int Y = sc.nextInt();
                int pos = Account.findPos(accountList, X);
                accountList[pos].deposit(Y);
            }
            else if (transaction.equals("withdraw")){
                String X = sc.next();
                int Y = sc.nextInt();
                int pos = Account.findPos(accountList, X);
                accountList[pos].withdraw(Y);
            }
            else if (transaction.equals("transfer")){
                String X = sc.next();
                String Y = sc.next();
                int Z = sc.nextInt();
                int pos1 = Account.findPos(accountList, X);
                int pos2 = Account.findPos(accountList, Y);
                if (accountList[pos1].getBalance() - Z >= 50000){
                    accountList[pos1].withdraw(Z);
                    accountList[pos2].deposit(Z);
                }
            }
        }
        
        for (Account x : accountList){
            System.out.println(x);
        }
        
    }
}
