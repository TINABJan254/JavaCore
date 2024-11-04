package thuchanh2.bai11;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        while (sc1.hasNextLine()){
            dsSV.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        
        Scanner sc2 = new Scanner(new File("HUONGDAN.in"));
        ArrayList<DoAn> dsDA = new ArrayList<>();
        int n = sc2.nextInt();
        sc2.nextLine();
        for (int i = 0; i < n; i++){
            String[] a = sc2.nextLine().split("\\s+");
            String tenGV = "";
            int k = Integer.parseInt(a[a.length - 1]);
            for (int j = 0; j < a.length - 1; j++){
                tenGV += a[j] + " ";
            }
            tenGV = tenGV.trim();
            
            for (int j = 0; j < k; j++){
                Scanner lineScan = new Scanner(sc2.nextLine());
                String maSV = lineScan.next();
                String deTai = "";
                while (lineScan.hasNext()){
                    deTai += lineScan.next() + " ";
                }
                
                for (SinhVien sv : dsSV){
                    if (sv.getMaSV().equals(maSV)){
                        dsDA.add(new DoAn(sv, tenGV, deTai.trim()));
                    }
                }
            }
        }
        
        Collections.sort(dsDA, new Comparator<DoAn>(){
            @Override
            public int compare(DoAn o1, DoAn o2){
                return o1.getSinhVien().getMaSV().compareTo(o2.getSinhVien().getMaSV());
            }
        });
        
        for (DoAn x : dsDA){
            System.out.println(x);
        }
        
    }
}