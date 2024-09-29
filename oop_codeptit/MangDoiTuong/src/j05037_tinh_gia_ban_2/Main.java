package j05037_tinh_gia_ban_2;

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
        
        Collections.sort(a, new Comparator<MatHang>(){
            @Override
            public int compare(MatHang o1, MatHang o2){
                return (int)(o2.giaBan() - o1.giaBan());
            }
        });
        
        for (MatHang x : a){
            System.out.println(x); 
        }
        
    }
}
