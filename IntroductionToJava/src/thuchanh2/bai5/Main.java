package thuchanh2.bai5;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> dsMH = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        while (sc.hasNextLine()){
            String maMH = sc.nextLine();
            String tenMH = sc.nextLine();
            String hinhThucThi = sc.nextLine();
            if (!hs.contains(maMH)){
                hs.add(maMH);
                dsMH.add(new MonHoc(maMH, tenMH, hinhThucThi));
            }
        }
        
        Collections.sort(dsMH, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2){
                return o1.getMaMH().compareTo(o2.getMaMH());
            }
        });
        
        for (MonHoc mh : dsMH){
            System.out.println(mh);
        }        
    }
}
