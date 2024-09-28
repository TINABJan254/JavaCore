package j05035_danh_sach_thuc_tap_2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(),
                    sc.nextLine(), sc.nextLine());
            a.add(x);
        }

        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });

        int q = sc.nextInt();
        while (q-- > 0) {
            String dn = sc.next();
            for (SinhVien x : a) {
                if (x.getDoanhNghiep().equals(dn)) {
                    System.out.println(x);
                }
            }
        }
    }
}
