package j05031_bang_diem_thanh_phan_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<BangDiem> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            BangDiem x = new BangDiem(sc.nextLine(), sc.nextLine(), sc.nextLine(), 
                    sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2){
                return o1.getTenSV().compareTo(o2.getTenSV());
            }
        });
        
        for (int i = 0; i < n; i++){
            System.out.println((i + 1) + " " + a.get(i));
        }
    }
}
