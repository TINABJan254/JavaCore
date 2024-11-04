package j06004_quan_ly_bai_tap_nhom_2;

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
        for (int i = 0; i < m; i++){
            dsNhom.get(i).setDeTai(sc.nextLine());
        }
        
        Collections.sort(dsSV, new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                return o1.getMaSV().compareTo(o2.getMaSV());
            }
        });
        
        for (SinhVien sinhVien : dsSV){
            System.out.println(sinhVien);
        }
        
    }
}