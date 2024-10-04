package j05042_bang_xep_hang;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt());
            a.add(x);
        }

        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (o1.getAC() != o2.getAC()) {
                    return o2.getAC() - o1.getAC();
                } else if (o1.getSubmit() != o2.getSubmit()) {
                    return o1.getSubmit() - o2.getSubmit();
                }
                return o1.getTenSV().compareTo(o2.getTenSV());
            }
        });

        for (SinhVien x : a) {
            System.out.println(x);
        }

    }
}
