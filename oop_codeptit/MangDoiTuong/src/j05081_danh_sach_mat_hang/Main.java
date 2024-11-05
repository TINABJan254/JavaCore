package j05081_danh_sach_mat_hang;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<MatHang> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            a.add(new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        
        Collections.sort(a);
        
        for (int i = 0; i < a.size(); i++){
            System.out.println(a.get(i));
        }
        
    }
}
