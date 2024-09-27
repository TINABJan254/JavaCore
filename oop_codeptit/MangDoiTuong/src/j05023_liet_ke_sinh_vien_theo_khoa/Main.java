/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j05023_liet_ke_sinh_vien_theo_khoa;

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
        
        int q = sc.nextInt();
        while (q-- > 0){
            String khoa = sc.next();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + ":");
            for (SinhVien x : a){
                if (x.khoaHoc().equals(khoa.substring(2))){
                    System.out.println(x);
                }
            }
        }
    }
}
