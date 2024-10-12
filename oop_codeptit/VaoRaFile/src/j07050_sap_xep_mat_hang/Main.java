package j07050_sap_xep_mat_hang;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<MatHang> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                if (o1.loiNhuan() < o2.loiNhuan()){
                    return 1;
                }
                return -1;
            }
        });
        
        for (MatHang x : a){
            System.out.println(x);
        }
    }
}