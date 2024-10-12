package j07028_tinh_gio_chuan;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList<MonHoc> mh = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String mMH = sc.next();
            String tenMH = sc.nextLine();
            tenMH = tenMH.trim();
            mh.add(new MonHoc(mMH, tenMH));
        }
        
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        int m = sc2.nextInt();
        ArrayList<GiangVien> gv = new ArrayList<>();
        for (int i = 0; i < m; i++){
            String mGV = sc2.next();
            String tenGV = sc2.nextLine();
            tenGV = tenGV.trim();
            gv.add(new GiangVien(mGV, tenGV));
        }
        
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int k = sc3.nextInt();
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, Double> hm = new HashMap<>();
        for (int i = 1; i <= k; i++){
            String mgv = sc3.next();
            String mmh = sc3.next();
            double h = sc3.nextDouble();
            if (hm.containsKey(mgv)){
                hm.put(mgv, hm.get(mgv) + h);
            }
            else{
                hm.put(mgv, h);
            }
        }
        
        for (GiangVien x : gv){
            System.out.printf("%s %.2f\n", x.getTenGV(), hm.get(x.getMaGV()));
        }
    }
}

