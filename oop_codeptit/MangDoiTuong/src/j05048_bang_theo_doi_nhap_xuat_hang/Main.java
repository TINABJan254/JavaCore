package j05048_bang_theo_doi_nhap_xuat_hang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            MatHang x = new MatHang(sc.next(), sc.nextLong());
            a.add(x);
        }
        
        for (MatHang x : a){
            System.out.println(x);
        }
    }
}