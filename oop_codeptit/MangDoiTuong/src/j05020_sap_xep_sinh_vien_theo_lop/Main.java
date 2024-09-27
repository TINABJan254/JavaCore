package j05020_sap_xep_sinh_vien_theo_lop;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }

        Collections.sort(a, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                if (!o1.getLop().equals(o2.getLop())) {
                    return o1.getLop().compareTo(o2.getLop());
                }
                return o1.getId().compareTo(o2.getId());
            }
        });

        for (SinhVien x : a) {
            System.out.println(x);
        }
    }
}
