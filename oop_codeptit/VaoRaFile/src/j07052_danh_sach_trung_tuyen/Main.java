package j07052_danh_sach_trung_tuyen;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("THISINH.in"));
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> listThiSinh = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            ThiSinh ts = new ThiSinh(sc.nextLine(), sc.nextLine().trim(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            listThiSinh.add(ts);
        }
        int chiTieu = sc.nextInt();
        
        Collections.sort(listThiSinh, new Comparator<ThiSinh>(){
            @Override
            public int compare(ThiSinh o1, ThiSinh o2){
                if (o1.diemXetTuyen() > o2.diemXetTuyen()){
                    return -1;
                } else if (o1.diemXetTuyen() < o2.diemXetTuyen()){
                    return 1;
                }
                return o1.getMaTs().compareTo(o2.getMaTs());
            }
        });
        
        double diemChuan = listThiSinh.get(chiTieu - 1).diemXetTuyen();
        System.out.printf("%.1f\n", diemChuan);
        for (ThiSinh ts : listThiSinh){
            System.out.println(ts + " " + ts.ketQua(diemChuan));
        }
    }
}