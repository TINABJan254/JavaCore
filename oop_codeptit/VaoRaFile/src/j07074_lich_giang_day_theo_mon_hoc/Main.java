package j07074_lich_giang_day_theo_mon_hoc;

import  java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc1 = new Scanner(new File("MONHOC.in"));
        Scanner sc2 = new Scanner(new File("LICHGD.in"));
        
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
        
        ArrayList<MonHoc> listMonHoc = new ArrayList<>();
        int n = sc1.nextInt();
        for (int i = 0; i < n; i++){
            sc1.nextLine();
            MonHoc mh = new MonHoc(sc1.nextLine(), sc1.nextLine(), sc1.nextInt());
            listMonHoc.add(mh);
        }
        
        ArrayList<LopHocPhan> listLopHocPhan = new ArrayList<>();
        int m = sc2.nextInt();
        sc2.nextLine();
        for (int i = 0; i < m; i++){
            MonHoc monHoc = null;
            String maMon = sc2.nextLine();
            int ngayDay = sc2.nextInt();
            int kipHoc = sc2.nextInt(); sc2.nextLine();
            String tenGV = sc2.nextLine();
            String phongHoc = sc2.nextLine();
            
            for (MonHoc mh : listMonHoc){
                if (mh.getMaMH().equals(maMon)){
                    monHoc = mh;
                    break;
                }
            }
            
            listLopHocPhan.add(new LopHocPhan(String.format("HP%03d", i + 1), monHoc, ngayDay, kipHoc, tenGV, phongHoc));
        }
        
        Collections.sort(listLopHocPhan, new Comparator<LopHocPhan>(){
            @Override
            public int compare(LopHocPhan o1, LopHocPhan o2){
                if (o1.getNgayDay() != o2.getNgayDay()){
                    return o1.getNgayDay() - o2.getNgayDay();
                } else if (o1.getKipHoc() != o2.getKipHoc()){
                    return o1.getKipHoc() - o2.getKipHoc();
                }
                return o1.getTenGV().compareTo(o2.getTenGV());
            }
        });
        
        String maMH = sc2.nextLine();
        for (MonHoc mh : listMonHoc){
            if (mh.getMaMH().equals(maMH)){
                System.out.printf("LICH GIANG DAY MON %s:\n", mh.getTenMH());
            }
        }
        
        for (LopHocPhan nhom : listLopHocPhan){
            if (nhom.getMonHoc().getMaMH().equals(maMH)){
                System.out.println(nhom);
            }
        }
        
    }
}