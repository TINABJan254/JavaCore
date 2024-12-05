package j07059_danh_sach_ca_thi;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{
        Scanner sc = new Scanner(new File("CATHI.in"));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<CaThi> listCaThi = new ArrayList<>();
        for (int i = 0; i < n; i++){
            CaThi ct = new CaThi(String.format("C%03d", i+1), sc.nextLine().trim(), sc.nextLine().trim(), sc.nextLine().trim());
            listCaThi.add(ct);
        }
        
        Collections.sort(listCaThi, new Comparator<CaThi>(){
            @Override
            public int compare(CaThi o1, CaThi o2){
                if (!o1.getNgayThi().equals(o2.getNgayThi())){
                    return o1.getNgayThi().compareTo(o2.getNgayThi());
                }
                if (!o1.getGio().equals(o2.getGio())){
                    return o1.getGio().compareTo(o2.getGio());
                }
                if (!o1.getPhut().equals(o2.getPhut())){
                    return o1.getPhut().compareTo(o2.getPhut());
                }
                return o1.getMa().compareTo(o2.getMa());
            }
        });
        
        for (CaThi ct : listCaThi){
            System.out.println(ct);
        }
        
    }
}
