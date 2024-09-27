package j05025_sap_xep_danh_sach_giang_vien;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GiangVien> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            GiangVien x = new GiangVien(i, sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<GiangVien>(){
            @Override
            public int compare(GiangVien o1, GiangVien o2){
                if (!o1.getTen().equals(o2.getTen())){
                    return o1.getTen().compareTo(o2.getTen());
                }
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (GiangVien x : a){
            System.out.println(x);
        }
    }
}
