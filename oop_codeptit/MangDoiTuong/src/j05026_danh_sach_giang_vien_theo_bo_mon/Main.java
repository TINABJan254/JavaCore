package j05026_danh_sach_giang_vien_theo_bo_mon;

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
        
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0){
            String boMon = sc.nextLine();
            String tmp = " " + boMon;
            String ma = "";
            for (int i = 1; i < tmp.length(); i++){
                if (tmp.charAt(i - 1) == ' '){
                    ma += Character.toUpperCase(tmp.charAt(i));
                }
            }
            System.out.println("DANH SACH GIANG VIEN BO MON " + ma + ":");
            for (GiangVien x : a){
                if (x.getBoMon().equals(boMon)){
                    System.out.println(x);
                }
            }
        }
    }
}
