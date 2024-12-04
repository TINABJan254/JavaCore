package j07053_xet_tuyen;

import java.io.*;
import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{
//        Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int n = sc.nextInt();
        ArrayList<ThiSinh> listThiSinh = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            ThiSinh ts = new ThiSinh(String.format("PH%02d", i + 1), sc.nextLine().trim(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            listThiSinh.add(ts);
        }
        
        for (ThiSinh ts : listThiSinh){
            System.out.println(ts);
        }   
    }
}