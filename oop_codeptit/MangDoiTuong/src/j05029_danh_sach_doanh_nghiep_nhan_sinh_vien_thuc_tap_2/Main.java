package j05029_danh_sach_doanh_nghiep_nhan_sinh_vien_thuc_tap_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<DoanhNghiep> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            DoanhNghiep x = new DoanhNghiep(sc.nextLine(), sc.nextLine(), sc.nextInt());
            arr.add(x);
        }

        Collections.sort(arr, new Comparator<DoanhNghiep>() {
            @Override
            public int compare(DoanhNghiep o1, DoanhNghiep o2) {
                if (o1.getSoLuong() != o2.getSoLuong()) {
                    return o2.getSoLuong() - o1.getSoLuong();
                }
                return o1.getId().compareTo(o2.getId());
            }
        });

        int q = sc.nextInt();
        while (q-- > 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n", a, b);
            for (DoanhNghiep x : arr){
                if (x.getSoLuong() >= a && x.getSoLuong() <= b){
                    System.out.println(x);
                }
            }
        }
    }
}
