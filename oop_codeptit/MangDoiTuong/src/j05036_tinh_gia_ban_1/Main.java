package j05036_tinh_gia_ban_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<MatHang> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            MatHang x = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            a.add(x);
        }
        
        for (MatHang x : a){
            System.out.println(x); 
        }
        
    }
}
