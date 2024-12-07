package j07073_dang_ky_hinh_thuc_giang_day;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<MonHoc> listMonHoc = new ArrayList<>();
        for (int i = 0; i < n; i++){
            MonHoc mh = new MonHoc(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            listMonHoc.add(mh);
        }
        
        Collections.sort(listMonHoc, new Comparator<MonHoc>(){
            @Override
            public int compare(MonHoc o1, MonHoc o2){
                return o1.getMaMH().compareTo(o2.getMaMH());
            }
        });
        
        for (MonHoc monHoc : listMonHoc){
            if (!monHoc.getDayTH().equals("Truc tiep")){
                System.out.println(monHoc);
            }
        }
    }
}
