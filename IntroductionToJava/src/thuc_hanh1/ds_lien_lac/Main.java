package thuc_hanh1.ds_lien_lac;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> a = new ArrayList<>();
        while (sc.hasNextLine()){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        Collections.sort(a, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                if (!o1.getLop().equals(o2.getLop())){
                    return o1.getLop().compareTo(o2.getLop());
                }
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (SinhVien x : a){
            System.out.println(x);
        }
        
    }
}
