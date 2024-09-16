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

public class J06003_QuanLyBaiTapNhom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Team> arr = new ArrayList<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            SinhVien x = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            int id = sc.nextInt();
            boolean flag = false;
            for (int j = 0; j < arr.size(); j++){
                if (arr.get(j).getId() == id){
                    arr.get(j).addSv(x);
                    flag = true;
                }
            }
            
            if (!flag){
                Team tmp = new Team();
                tmp.setId(id);
                tmp.addSv(x);
                arr.add(tmp);
            }
        }
        
        //de tai
        sc.nextLine();
        for (int i = 0; i < m; i++){
            String prob = sc.nextLine();
            arr.get(i).setProb(prob);
        }
        
        //query
        int q = sc.nextInt();
        while (q-- != 0){
            int id = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", id);
            for (Team x : arr){
                if (x.getId() == id)
                    System.out.println(x);
            }
        }
    }
}

class SinhVien{
    private String id, ten, sdt;
    
    public SinhVien(){
        id = ""; ten = ""; sdt = "";
    }
    
    public SinhVien(String id, String ten, String sdt){
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
    }
    
    @Override
    public String toString(){
        return id + " " + ten + " " + sdt;
    }
}

class Team{
    private ArrayList<SinhVien> a;
    private int id;
    private String prob;
    
    public Team(){
        a = new ArrayList<>();
        id = 0;
        prob = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProb() {
        return prob;
    }

    public void setProb(String prob) {
        this.prob = prob;
    }

    public ArrayList<SinhVien> getA() {
        return a;
    }

    public void setA(ArrayList<SinhVien> a) {
        this.a = a;
    }
    
    public void addSv(SinhVien x){
        a.add(x);
    }
    
    @Override
    public String toString(){
        String res = "";
        for (SinhVien x : a){
            res += x + "\n";
        }
        
        res += "Bai tap dang ky: " + prob;
        return res;
    }   
}

/*
Lớp học LTHĐT được chia thành các nhóm. Mỗi nhóm sẽ đăng ký một bài tập. 
Hãy tra cứu danh sách dữ liệu vào và liệt kê danh sách của các nhóm được yêu cầu và bài tập mà nhóm đó cần thực hiện.

Input

Dòng đầu ghi 2 số N và M (N không quá 100, M < N) là số sinh viên và số nhóm.

Mỗi sinh viên ghi 4 dòng gồm:

Mã sinh viên: không quá 15 ký tự
Họ tên: Không quá 50 ký tự
Số điện thoại: không quá 15 ký tự số
Số thứ tự nhóm (đảm bảo từ 1 đến M).
Tiếp theo là M dòng, mỗi dòng ghi tên một bài tập lớn ứng với thứ tự nhóm từ 1 đến M. 
Độ dài tên bài tập không quá 200 ký tự.
Tiếp theo là một dòng ghi số Q là số truy vấn
Tiếp theo là Q dòng, mỗi dòng ghi số thứ tự nhóm cần truy vấn thông tin.
Output
Ghi ra danh sách nhóm theo từng truy vấn, giữ nguyên thứ tự thành viên ban đầu. Sau đó là bài tập được giao cho nhóm. 
Mẫu trình bày danh sách như trong ví dụ.
Ví dụ

Input
5 2
B17DTCN001
Nguyen Chi  Linh
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
Nguyen Van  Quyet
0977865432
2
B17DTCN031
Ngo Thanh Vien
0912313111
2
Xay dung website ban dien thoai truc tuyen
Xay dung ung dung quan ly benh nhan Covid-19
1
1

Output
DANH SACH NHOM 1:
B17DTCN001 Nguyen Chi  Linh 0987345543
B17DTCN011 Vu Viet Thang 0981234567
B17DTCN023 Pham Trong Thang 0992123456
Bai tap dang ky: Xay dung website ban dien thoai truc tuyen
*/
