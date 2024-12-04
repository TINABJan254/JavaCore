package thuchanh3.bai3;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        while (sc.hasNextLine()){
            SinhVien sv = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listSinhVien.add(sv);
        }
        
        Collections.sort(listSinhVien, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (!o1.getLop().equals(o2.getLop())){
                    return o1.getLop().compareTo(o2.getLop());
                }
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        for (SinhVien sv : listSinhVien){
            System.out.println(sv);
        }        
    }
}
