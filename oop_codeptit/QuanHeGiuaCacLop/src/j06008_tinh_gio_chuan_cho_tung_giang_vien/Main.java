package j06008_tinh_gio_chuan_cho_tung_giang_vien;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MonHoc> dsMh = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String mMH = sc.next();
            String tenMH = sc.nextLine();
            tenMH = tenMH.trim();
            dsMh.add(new MonHoc(mMH, tenMH));
        }

        int m = sc.nextInt();
        ArrayList<GiangVien> dsGv = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String mGV = sc.next();
            String tenGV = sc.nextLine();
            tenGV = tenGV.trim();
            dsGv.add(new GiangVien(mGV, tenGV));
        }

        int k = sc.nextInt();
        ArrayList<HocPhan> dsHp = new ArrayList<>();
        for (int i = 1; i <= k; i++) {
            String maGV = sc.next();
            String maMH = sc.next();
            double h = sc.nextDouble();

            GiangVien giangVien = null;
            for (GiangVien x : dsGv) {
                if (x.getMaGV().equals(maGV)) {
                    giangVien = x;
                    break;
                }
            }

            MonHoc monHoc = null;
            for (MonHoc mh : dsMh) {
                if (mh.getMaMH().equals(maMH)) {
                    monHoc = mh;
                    break;
                }
            }

            dsHp.add(new HocPhan(giangVien, monHoc, h));
        }

        String mgv = sc.next();
        for (GiangVien gv : dsGv) {
            double tong = 0;
            if (gv.getMaGV().equals(mgv)) {
                System.out.println("Giang vien: " + gv.getTenGV());
                for (HocPhan hp : dsHp) {
                    if (hp.getGiangVien() == gv) {
                        String gioChuan = String.format("%.10f", hp.getGioChuan()).replaceAll("0*$", "").replaceAll("\\.$", "");
                        System.out.printf("%s %s\n", hp.getMonHoc().getTenMH(), gioChuan);
                        tong += hp.getGioChuan();
                    }
                }
                System.out.printf("Tong: %.2f\n", tong);
            }
        }

    }
}
