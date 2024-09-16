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

public class SundayLeague {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Team> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            String tmp = sc.next();
            String id = sc.next(); sc.nextLine();
            String name = sc.nextLine();
            int a, b, c;
            a = sc.nextInt(); b = sc.nextInt(); c = sc.nextInt();
            tmp = sc.next();
            Team x = new Team(id, name, a, b, c);
            arr.add(x);
        }
        
        sc.nextLine();
        for (int i = 0; i < 10; i++){
            String s = sc.nextLine();
            String[] a = s.split(" ");
            String team1 = "", team2 = "";
            int pos = 0;
            for (int j = 0; j < a.length; j++){
                if (a[j].equals("-")){
                    pos = j;
                    break;
                }
            }
            
            for (int j = 0; j < pos - 1; j++){
                team1 += a[j] + " ";
            }
            
            for (int j = pos + 2; j < a.length; j++){
                team2 += a[j] + " ";
            }
            team1 = team1.trim();
            team2 = team2.trim();
            int g1 = Integer.parseInt(a[pos - 1]);
            int g2 = Integer.parseInt(a[pos + 1]);
            
            for (int j = 0; j < arr.size(); j++){
                if (arr.get(j).getName().equals(team1)){
                    arr.get(j).setPlayedMatches(arr.get(j).getPlayedMatches() + 1);
                    arr.get(j).setGoalDifference(arr.get(j).getGoalDifference() + (g1 - g2));
                    if (g1 > g2)
                        arr.get(j).setPoint(arr.get(j).getPoint() + 3);
                    else if (g1 == g2)
                        arr.get(j).setPoint(arr.get(j).getPoint() + 1);
                }
                else if (arr.get(j).getName().equals(team2)){
                    arr.get(j).setPlayedMatches(arr.get(j).getPlayedMatches() + 1);
                    arr.get(j).setGoalDifference(arr.get(j).getGoalDifference() + (g2 - g1));
                    if (g2 > g1)
                        arr.get(j).setPoint(arr.get(j).getPoint() + 3);
                    else if (g1 == g2)
                        arr.get(j).setPoint(arr.get(j).getPoint() + 1);
                }
            }
        }
        
        arr.sort(new Comparator<Team>(){
            @Override
            public int compare(Team o1, Team o2){
                if (o1.getPoint() != o2.getPoint())
                    return o2.getPoint() - o1.getPoint();
                if (o1.getGoalDifference() != o2.getGoalDifference())
                    return o2.getGoalDifference() - o1.getGoalDifference();
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (int i = 0; i < arr.size(); i++){
            System.out.println("#" + (i+1) + " " + arr.get(i));
        }
        
    }
}

class Team{
    private String id, name;
    private int playedMatches, point, goalDifference;
    
    public Team(){
        id = ""; name = ""; 
        playedMatches = 0;
        point = 0;
        goalDifference = 0;
    }
    
    public Team(String id, String name, int playedMatches, int goalDifference, int point) {
        this.id = id;
        this.name = name;
        this.playedMatches = playedMatches;
        this.point = point;
        this.goalDifference = goalDifference;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayedMatches() {
        return playedMatches;
    }

    public void setPlayedMatches(int playedMatches) {
        this.playedMatches = playedMatches;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(int goalDifference) {
        this.goalDifference = goalDifference;
    }
    
    
    @Override
    public String toString(){
        return id + " " + name + " " + playedMatches + " " + goalDifference + " " + point + "\n------------------\n";
    }
    
}
