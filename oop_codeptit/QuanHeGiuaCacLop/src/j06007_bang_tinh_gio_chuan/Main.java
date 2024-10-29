package j06007_bang_tinh_gio_chuan;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MonHoc> mh = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String mMH = sc.next();
            String tenMH = sc.nextLine();
            tenMH = tenMH.trim();
            mh.add(new MonHoc(mMH, tenMH));
        }
        
        int m = sc.nextInt();
        ArrayList<GiangVien> gv = new ArrayList<>();
        for (int i = 0; i < m; i++){
            String mGV = sc.next();
            String tenGV = sc.nextLine();
            tenGV = tenGV.trim();
            gv.add(new GiangVien(mGV, tenGV));
        }
        
        int k = sc.nextInt();
        ArrayList<HocPhan> hp = new ArrayList<>();
        for (int i = 1; i <= k; i++){
            String maGV = sc.next();
            String maMH = sc.next();
            double h = sc.nextDouble();
            
            GiangVien giangVien = null;
            for (GiangVien x : gv){
                if (x.getMaGV().equals(maGV)){
                    giangVien = x;
                    break;
                }
            }
            
            MonHoc monHoc = null;
            for (MonHoc x : mh){
                if (x.getMaMH().equals(maMH)){
                    monHoc = x;
                    break;
                }
            }
            
            hp.add(new HocPhan(giangVien, monHoc, h));
        }
        
        for (GiangVien x : gv){
            double res = 0;
            for (HocPhan y : hp){
                if (y.getGiangVien() == x){
                    res += y.getGioChuan();
                }
            }
            System.out.printf("%s %.2f\n", x.getTenGV(), res);
        }
        
    }
}