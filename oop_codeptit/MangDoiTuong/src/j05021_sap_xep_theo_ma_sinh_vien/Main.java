package j05021_sap_xep_theo_ma_sinh_vien;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> a = new ArrayList<>();
        while (sc.hasNext()){
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }

        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}
