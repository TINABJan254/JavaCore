package j06003_quan_ly_bai_tap_nhom_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        ArrayList<Nhom> dsNhom = new ArrayList<>();
        for (int i = 1; i <= m; i++){
            dsNhom.add(new Nhom(i, ""));
        }
        for (int i = 0; i < n; i++){
            sc.nextLine();
            String maSV = sc.nextLine();
            String tenSV = sc.nextLine();
            String sdt = sc.nextLine();
            int nhomId = sc.nextInt();
            Nhom nhom = null;
            for (Nhom x : dsNhom){
                if (x.getId() == nhomId){
                    nhom = x;
                }
            }
            dsSV.add(new SinhVien(maSV, tenSV, sdt, nhom));
        }
        
        sc.nextLine();
        for (int i = 1; i <= m; i++){
            //dsNhom.get(i - 1).setDeTai(sc.nextLine());
            for (Nhom nhom : dsNhom){
                if (nhom.getId() == i){
                    nhom.setDeTai(sc.nextLine());
                }
            }
        }
        
        int q = sc.nextInt();
        while (q-- > 0){
            int nhomId = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", nhomId);
            String deTai = "";
            for (SinhVien sv : dsSV){
                if (sv.getNhom().getId() == nhomId){
                    System.out.println(sv);
                    deTai = sv.getNhom().getDeTai();
                }
            }
            System.out.println("Bai tap dang ky: " + deTai);
        }
    }
}