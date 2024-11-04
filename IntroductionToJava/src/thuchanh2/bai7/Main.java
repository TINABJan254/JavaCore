package thuchanh2.bai7;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n; i++){
            dsSV.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }
        Collections.sort(dsSV, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        Scanner sc2 = new Scanner(new File("DANGKY.in"));
        while(sc2.hasNextLine()){
            Scanner lineScan = new Scanner(sc2.nextLine());
            String maSV = lineScan.next();
            String sizeDo = lineScan.next();
            for (int i = 0; i < n; i++){
                if (dsSV.get(i).getMaSV().equals(maSV)){
                    dsSV.get(i).setSizeDo(sizeDo);
                }
            }
        }
        
        Scanner sc3 = new Scanner(new File("TRUYVAN.in"));
        int q = sc3.nextInt();
        while (q-- > 0){
            String gioiTinh = sc3.next();
            String sizeDo = sc3.next();
            System.out.printf("DANH SACH SINH VIEN %s DANG KY SIZE %s\n", gioiTinh.toUpperCase(), sizeDo);
            for (SinhVien sinhVien : dsSV){
                if (sinhVien.getGioiTinh().equals(gioiTinh) && sinhVien.getSizeDo().equals(sizeDo)){
                    System.out.println(sinhVien);
                }
            }
        }
    }
}
