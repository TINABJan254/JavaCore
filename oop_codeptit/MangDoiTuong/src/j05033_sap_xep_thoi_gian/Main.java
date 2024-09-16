package j05033_sap_xep_thoi_gian;

import java.util.*;
import java.math.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThoiGian> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(new ThoiGian(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }

        Collections.sort(a, new Comparator<ThoiGian>() {
            @Override
            public int compare(ThoiGian o1, ThoiGian o2) {
                if (o1.getGio() != o2.getGio()) {
                    return o1.getGio() - o2.getGio();
                } else if (o1.getPhut() != o2.getPhut()) {
                    return o1.getPhut() - o2.getPhut();
                } else if (o1.getGiay() != o2.getGiay()) {
                    return o1.getGiay() - o2.getGiay();
                }
                return -1;
            }
        });

        for (ThoiGian x : a) {
            System.out.println(x);
        }
    }
}
