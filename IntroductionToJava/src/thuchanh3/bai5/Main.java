package thuchanh3.bai5;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        int n = sc1.nextInt();
        ArrayList<MonHoc> listMonHoc = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String maMH = sc1.next();
            String tenMH = sc1.nextLine().trim();
            listMonHoc.add(new MonHoc(maMH, tenMH));
        }
        
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        int m = sc2.nextInt();
        ArrayList<GiangVien> listGiangVien = new ArrayList<>();
        for (int i = 0; i < m; i++){
            String maGV = sc2.next();
            String tenGV = sc2.nextLine().trim();
            listGiangVien.add(new GiangVien(maGV, tenGV));
        }
        
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int k = sc3.nextInt();
        ArrayList<HocPhan> listHocPhan = new ArrayList<>();
        for (int i = 0; i < k; i++){
            String maGV = sc3.next();
            String maMH = sc3.next();
            double h = sc3.nextDouble();
            
            GiangVien giangVien = null;
            for (GiangVien gv : listGiangVien){
                if (gv.getMaSV().equals(maGV)){
                    giangVien = gv;
                    break;
                }
            }
            
            MonHoc monHoc = null;
            for (MonHoc mh : listMonHoc){
                if (mh.getMaMH().equals(maMH)){
                    monHoc = mh;
                    break;
                }
            }
            
            listHocPhan.add(new HocPhan(giangVien, monHoc, h));
        }
        
        for (GiangVien gv : listGiangVien){
            double res = 0;
            for (HocPhan hp : listHocPhan){
                if (hp.getGiangVien() == gv){
                    res += hp.getGioChuan();
                }
            }
            System.out.printf("%s %.2f\n", gv.getTenGV(), res);
        }
    }
}
