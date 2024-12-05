package j07057_diem_tuyen_sinh;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("THISINH.in"));
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> listThiSinh = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            ThiSinh ts = new ThiSinh(String.format("TS%02d", i + 1), sc.nextLine().trim(), Double.parseDouble(sc.nextLine()), sc.nextLine(), sc.nextInt());
            listThiSinh.add(ts);
        }
        
        Collections.sort(listThiSinh, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2){
                if (o1.tongDiem() > o2.tongDiem()){
                    return -1;
                } else if (o1.tongDiem() < o2.tongDiem()){
                    return 1;
                }
                return o1.getMaTs().compareTo(o2.getMaTs());
            }
        });
        
        for (ThiSinh ts : listThiSinh){
            System.out.println(ts);
        }
    }
}