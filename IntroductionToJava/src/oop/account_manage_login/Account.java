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

public class Account {
    private String id, customerId, username, password;
    
    public Account(){
        id = ""; customerId = ""; username = ""; password = "";
    }
    
    public Account(String id, String customerId, String username, String password){
        this.id = id;
        this.customerId = customerId;
        this.username = username;
        this.password = password;
    }
    
    public boolean checkLogin(String username, String password){
        if (this.username.equals(username) && this.password.equals(password))
            return true;
        return false;
    }
    
}
