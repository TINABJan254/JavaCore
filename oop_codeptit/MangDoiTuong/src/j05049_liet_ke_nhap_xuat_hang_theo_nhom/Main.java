package j05049_liet_ke_nhap_xuat_hang_theo_nhom;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> listMatHang = new ArrayList<>();
        for (int i = 0; i < n; i++){
            listMatHang.add(new MatHang(sc.next(), sc.nextLong()));
        }
        
        Collections.sort(listMatHang, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                if (o1.thue() > o2.thue()){
                    return -1;
                }
                return 1;
            }
        });
        
        char nhom = sc.next().charAt(0);
        for (MatHang matHang : listMatHang){
            if (matHang.getMaMH().charAt(0) == nhom){
                System.out.println(matHang);
            }
        }   
    }
}