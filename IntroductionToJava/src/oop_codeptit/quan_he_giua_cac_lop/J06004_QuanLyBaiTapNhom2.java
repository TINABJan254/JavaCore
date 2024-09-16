package oop_codeptit.quan_he_giua_cac_lop;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class J06004_QuanLyBaiTapNhom2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            arr.add(x);
        }
        
        //de tai
        sc.nextLine();
        for (int i = 0; i < m; i++) {            
            String prob = sc.nextLine();
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j).getTeam() == i + 1) {
                    arr.get(j).setProb(prob);
                }
            }
        }
        
        arr.sort(new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2){
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (SinhVien x : arr){
            System.out.println(x);
        }
        
    }
}

class SinhVien {

    private String id, ten, sdt, prob;
    private int team;
    
    public SinhVien() {
        id = "";
        ten = "";
        sdt = "";
        team = 0;
        prob = "";
    }
    
    public SinhVien(String id, String ten, String sdt, int team) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.team = team;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTen() {
        return ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public String getSdt() {
        return sdt;
    }
    
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    
    public String getProb() {
        return prob;
    }
    
    public void setProb(String prob) {
        this.prob = prob;
    }
    
    public int getTeam() {
        return team;
    }
    
    public void setTeam(int team) {
        this.team = team;
    }
    
    @Override
    public String toString() {
        return id + " " + ten + " " + sdt + " " + team + " " + prob;
    }
}

/*
Lớp học LTHĐT được chia thành các nhóm. Mỗi nhóm sẽ đăng ký một bài tập. 
Hãy liệt kê toàn bộ danh sách sinh viên theo thứ tự sắp xếp mã sinh viên tăng dần và thứ tự nhóm, 
tên bài tập nhóm mà từng sinh viên cần thực hiện.

Input

Dòng đầu ghi 2 số N và M (N không quá 100, M < N) là số sinh viên và số nhóm.
Mỗi sinh viên ghi 4 dòng gồm:
Mã sinh viên: không quá 15 ký tự
Họ tên: Không quá 50 ký tự
Số điện thoại: không quá 15 ký tự số
Số thứ tự nhóm (đảm bảo từ 1 đến M).
Tiếp theo là M dòng, mỗi dòng ghi tên một bài tập lớn ứng với thứ tự nhóm từ 1 đến M. 
Độ dài tên bài tập không quá 200 ký tự.
Output

Ghi ra danh sách tất cả sinh viên theo thứ tự mã sinh viên tăng dần (thứ tự từ điển). 
Mỗi sinh viên bao gồm: mã, họ tên, số điện thoại, số thứ tự nhóm, tên bài tập nhóm.

Ví dụ

Input

5 2
B17DTCN001
Nguyen Chi Linh
0987345543
1
B17DTCN011
Vu Viet Thang
0981234567
1
B17DTCN023
Pham Trong Thang
0992123456
1
B17DTCN022
Nguyen Van Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19

Output

B17DTCN001 Nguyen Chi Linh 0987345543 1 Xay dung website ban dien thoai truc tuyen
B17DTCN011 Vu Viet Thang 0981234567 1 Xay dung website ban dien thoai truc tuyen
B17DTCN022 Nguyen Van Quyet 0977865432 2 Xay dung ung dung quan ly benh nhan Covid-19
B17DTCN023 Pham Trong Thang 0992123456 1 Xay dung website ban dien thoai truc tuyen
B17DTCN031 Ngo Thanh Vien 0912313111 2 Xay dung ung dung quan ly benh nhan Covid-19
 */
