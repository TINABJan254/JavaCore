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

public class Account {
    private String id, customerId, accountNumber, pinCode;
    private int balance;
    
    public Account(){
        id = ""; customerId = ""; accountNumber = ""; pinCode = "";
        balance = 0;
    }
    
    public Account(String id, String customerId, String accountNumber, String pinCode, int balance){
        this.id = id;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    
    public void deposit(int amount){
        balance += amount;
    }
    
    public void withdraw(int amount){
        if (balance - amount >= 50000)
            balance -= amount;
    }
    
    public static int findPos(Account a[], String accountNumber){
        for (int i = 0; i < a.length; i++){
            if (a[i].accountNumber.equals(accountNumber)){
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public String toString(){
        return "ID : " + id + "\nCusID : " + customerId + "\nNumber : " + accountNumber + "\nPIN : " + pinCode
                + "\nBalance : " + balance + "\n-------------------";
    }
    
}
