package j05028_danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            a.add(x);
        }

        Collections.sort(a, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if (o1.getSoLuong() != o2.getSoLuong()) {
                    return o2.getSoLuong() - o1.getSoLuong();
                }
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (DoanhNghiep x : a) {
            System.out.println(x);
        }
    }
}
