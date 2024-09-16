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

public class GiaiCuu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = Integer.parseInt(sc.nextLine().substring(8));
        int blood = Integer.parseInt(sc.nextLine().substring(8));
        boolean alive = false;
        String tmp = sc.nextLine();
        if (tmp.equals("ALIVE")) alive = true;
        NhanVat ThienBan = new NhanVat(power, blood, alive);
        
        int numEvent = sc.nextInt();
        while (numEvent-- != 0){
            String event = sc.next();
            if (event.equals("mushroom") && ThienBan.isAlive()){
                ThienBan.mushroom();
            }
            else if (event.equals("witch") && ThienBan.isAlive()){
                int witchPower = sc.nextInt();
                ThienBan.witch(witchPower);
            }
            else if (event.equals("pea") && ThienBan.isAlive()){
                ThienBan.pea();
            }
            else if (event.equals("soldier")&& ThienBan.isAlive()){
                int soldierPower = sc.nextInt();
                ThienBan.soldier(soldierPower);
            }
            System.out.println(ThienBan);
        }
    }
}

class NhanVat{
    private int power, blood;
    private boolean alive;
    
    public NhanVat(){
        power = 0; blood = 0; alive = true;
    }
    
    public NhanVat(int power, int blood, boolean alive){
        this.power = power;
        this.blood = blood;
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }
    
    public void mushroom(){
        blood -= 15;
        power -= 2;
    }
    
    public void witch(int witchPower){
        if (this.power > witchPower){
            this.power += 5;
        }
        else{
            blood = 0;
            power = 0;
            alive = false;
        }
    }
    
    public void pea(){
        this.blood += 10;
        this.power += 2;
    }
    
    public void soldier(int soldierPower){
        if (this.power > soldierPower){
            this.blood += 5;
            this.power += 7;
        }
        else{
            blood = 0;
            power = 0;
            alive = false;
        }
    }
    
    public String toString(){
        String res = "POWER : " + power + "\nBLOOD : " + blood + "\n";
        if (alive){
            res += "ALIVE\n--------------------\n";
        }
        else{
            res += "DEAD\n--------------------\n";
        }
        return res;
    }
    
}