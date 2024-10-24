package j05046_bang_ke_nhap_kho;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            String tenMH = sc.nextLine();
            int soLuong = sc.nextInt();
            double donGia = sc.nextDouble();
            Scanner lineScan = new Scanner(tenMH);
            String maMH = "" + Character.toUpperCase(lineScan.next().charAt(0)) 
                    + Character.toUpperCase(lineScan.next().charAt(0));
            if (hm.containsKey(maMH)){
                hm.put(maMH, hm.get(maMH) + 1);
            }
            else {
                hm.put(maMH, 1);
            }
            maMH += String.format("%02d", hm.get(maMH));
            MatHang x = new MatHang(maMH, tenMH, soLuong, donGia);
            a.add(x);
        }
        
        for (MatHang x : a){
            System.out.println(x);
        }
        
    }
}