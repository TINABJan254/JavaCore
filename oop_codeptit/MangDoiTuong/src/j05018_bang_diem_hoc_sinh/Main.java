package j05018_bang_diem_hoc_sinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<BangDiem> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            String ten = sc.nextLine();
            double[] diem = new double[10];
            for (int j = 0; j < 10; j++){
                diem[j] = sc.nextDouble();
            }
            a.add(new BangDiem(i, ten, diem));
        }
        
        Collections.sort(a, new Comparator<BangDiem>(){
            @Override
            public int compare(BangDiem o1, BangDiem o2){
                if (o1.diemTB() > o2.diemTB()){
                    return -1;
                }
                else if (o1.diemTB() < o2.diemTB()){
                    return 1;
                }
                return o1.getId().compareTo(o2.getId());
            }
        });
        
        for (BangDiem x : a){
            System.out.println(x);
        }
        
    }
}
