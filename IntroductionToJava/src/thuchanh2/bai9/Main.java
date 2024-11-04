package thuchanh2.bai9;

import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("INSTITUTION.in"));
        ArrayList<DaiHoc> dsDH = new ArrayList<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n; i++){
            Scanner lineScan = new Scanner(sc1.nextLine());
            String maTruong = lineScan.next();
            String tenTruong = "";
            while (lineScan.hasNext()){
                tenTruong += lineScan.next() + " ";
            }
            dsDH.add(new DaiHoc(maTruong, tenTruong.trim()));
        }
        
        Scanner sc2 = new Scanner(new File("REGISTER.in"));
        ArrayList<DoiThi> dsDoiThi = new ArrayList<>();
        int m = sc2.nextInt();
        for (int i = 0; i < m; i++){
            String maTruong = sc2.next();
            int k = sc2.nextInt();
            sc2.nextLine();
            for (int j = 0; j < k; j++){
                String tenDoi = sc2.nextLine();
                DaiHoc dh = null;
                for (DaiHoc x : dsDH){
                    if (x.getMaTruong().equals(maTruong)){
                        dh = x;
                    }
                }
                dsDoiThi.add(new DoiThi(tenDoi, dh));
            }
        }
        
        Collections.sort(dsDoiThi, new Comparator<DoiThi>(){
            @Override
            public int compare(DoiThi o1, DoiThi o2){
                if (!o1.getDaiHoc().getTenTruong().equals(o2.getDaiHoc().getTenTruong())){
                    return o1.getDaiHoc().getTenTruong().compareTo(o2.getDaiHoc().getTenTruong());
                }
                return o1.getTenDoi().compareTo(o2.getTenDoi());
            }
        });
        
        for (int i = 0; i < dsDoiThi.size(); i++){
            dsDoiThi.get(i).setId(String.format("team%02d", i + 1));
        }
        
        for (DoiThi t : dsDoiThi){
            System.out.println(t);
        }
    }
}
