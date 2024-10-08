package thuc_hanh1.bao_cao_ttcs;

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
        
        Scanner sc3 = new Scanner(new File("HOIDONG.in"));
        n = sc3.nextInt();
        sc3.nextLine();
        HashSet<String> hs = new HashSet<>();
        ArrayList<HoiDong> hd = new ArrayList<>();
        for (int i = 0; i < n; i++){
            HoiDong x = new HoiDong(sc3.next(), sc3.next(), sc3.next());
            hs.add(x.getMaHD());
            hd.add(x);
        }
        
        Collections.sort(hd, new Comparator<HoiDong>(){
           @Override
           public int compare(HoiDong o1, HoiDong o2){
               return o1.getMaSV().compareTo(o2.getMaSV());
           }
        });
        
        for (int i = 1; i <= hs.size(); i++){
            System.out.println("DANH SACH HOI DONG " + i + ":");
            String mhd = "HD" + i;
            for (HoiDong x : hd){
                if (x.getMaHD().equals(mhd)){
                    String msv = x.getMaSV();
                    String mdt = x.getMaDT();
                    for (SinhVien sv : a){
                        if (sv.getId().equals(msv)){
                            System.out.print(sv + " ");
                            break;
                        }
                    }
                    
                    for (DeTai dt : b){
                        if (dt.getMaDT().equals(mdt)){
                            System.out.println(dt);
                            break;
                        }
                    }
                }
            }
        }   
    }
}
