package thuc_hanh1.thuc_tap_co_so;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        int n = sc1.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        sc1.nextLine();
        for (int i = 0; i < n; i++){
            SinhVien x = new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine());
            a.add(x);
        }
        
        ArrayList<DeTai> b = new ArrayList<>();
        Scanner sc2 = new Scanner(new File("DETAI.in"));
        int m = sc2.nextInt();
        sc2.nextLine();
        for (int i = 1; i <= m; i++){
            DeTai x = new DeTai(i, sc2.nextLine(), sc2.nextLine());
            b.add(x);
        }
        
        Scanner sc3 = new Scanner(new File("NHIEMVU.in"));
        n = sc3.nextInt();
        sc3.nextLine();
        HashMap<String, String> hm = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String msv = sc3.next();
            String mdt = sc3.next();
            String tmp = "";
            for (SinhVien x : a){
                if (x.getId().equals(msv)){
                    tmp += x + " ";
                    break;
                }
            }
            
            for (DeTai x : b){
                if (x.getMaDT().equals(mdt)){
                    tmp += x;
                    hm.put(tmp, x.getTenDT());
                    break;
                }
            }
            res.add(tmp);
        }
        
        Collections.sort(res, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return hm.get(o1).compareTo(hm.get(o2));
            }
        });
        
        for (String x : res){
            System.out.println(x);
        }
        
    }
}
