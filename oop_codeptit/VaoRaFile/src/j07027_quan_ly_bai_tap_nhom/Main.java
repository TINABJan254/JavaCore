package j07027_quan_ly_bai_tap_nhom;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1 = new Scanner(new File("SINHVIEN.in"));
        Scanner sc2 = new Scanner(new File("BAITAP.in"));
        Scanner sc3 = new Scanner(new File("NHOM.in"));

//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);

        int n = sc1.nextInt();
        sc1.nextLine();
        ArrayList<SinhVien> listSinhVien = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            listSinhVien.add(new SinhVien(sc1.nextLine(), sc1.nextLine(), sc1.nextLine()));
        }

        int m = sc2.nextInt();
        sc2.nextLine();
        HashMap<Integer, String> listBaiTap = new HashMap<>();
        for (int i = 1; i <= m; i++) {
            listBaiTap.put(i, sc2.nextLine());
        }

        for (int i = 0; i < n; i++) {
            String maSV = sc3.next();
            int nhom = sc3.nextInt();
            for (SinhVien sv : listSinhVien) {
                if (sv.getMaSV().equals(maSV)) {
                    sv.setNhom(nhom);
                    sv.setBaitap(listBaiTap.get(nhom));
                }
            }
        }

        Collections.sort(listSinhVien, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });

        for(SinhVien sv : listSinhVien){
            System.out.println(sv);
        }
    }
}