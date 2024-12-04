package thuchanh3.bai2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<CongNhan> listCongNhan = new ArrayList<>();
        for (int i = 0; i < n; i++){
            CongNhan cn = new CongNhan(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            listCongNhan.add(cn);
        }
        
        Collections.sort(listCongNhan, new Comparator<CongNhan>(){
            @Override
            public int compare(CongNhan o1, CongNhan o2){
                if (o1.gioLam() != o2.gioLam()){
                    return o2.gioLam() - o1.gioLam();
                } else if (o1.phutLam() != o2.phutLam()){
                    return o2.phutLam() - o1.phutLam();
                }
                return o1.getMaCN().compareTo(o2.getMaCN());
            }
        });
        
        for (CongNhan cn : listCongNhan){
            System.out.println(cn);
        }
        
    }
}
