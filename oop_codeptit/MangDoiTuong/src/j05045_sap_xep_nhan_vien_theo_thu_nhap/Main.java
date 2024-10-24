package j05045_sap_xep_nhan_vien_theo_thu_nhap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            NhanVien x = new NhanVien(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien o1, NhanVien o2){
                if (o1.thuNhap() > o2.thuNhap()){
                    return -1;
                }
                else if (o1.thuNhap() < o2.thuNhap()){
                    return 1;
                }
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (NhanVien x : a){
            System.out.println(x);
        }
        
    }
}
