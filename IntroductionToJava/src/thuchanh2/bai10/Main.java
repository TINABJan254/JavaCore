package thuchanh2.bai10;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        while (sc.hasNextLine()){
            dsSV.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        
        Collections.sort(dsSV, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (!o1.getLop().equals(o2.getLop())){
                    return o1.getLop().compareTo(o2.getLop());
                }
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        for (SinhVien sinhVien : dsSV){
            System.out.println(sinhVien);
        }
        
    }
            
}