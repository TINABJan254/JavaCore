package thuc_hanh1.tong_so_gio_day;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        ArrayList<MonHoc> mh = new ArrayList<>();
        for (int i = 0; i < n; i++){
            String mMH = sc.next();
            String tenMH = sc.nextLine();
            tenMH = tenMH.trim();
            mh.add(new MonHoc(mMH, tenMH));
        }
        
        Scanner sc2 = new Scanner(new File("GIANGVIEN.in"));
        int m = sc2.nextInt();
        ArrayList<GiangVien> gv = new ArrayList<>();
        for (int i = 0; i < m; i++){
            String mGV = sc2.next();
            String tenGV = sc2.nextLine();
            tenGV = tenGV.trim();
            gv.add(new GiangVien(mGV, tenGV));
        }
        
        Scanner sc3 = new Scanner(new File("GIOCHUAN.in"));
        int k = sc3.nextInt();
        ArrayList<String> res = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 1; i <= k; i++){
            String mgv = sc3.next();
            String mmh = sc3.next();
            double h = sc3.nextDouble();
            for (int j = 0; j < m; j++){
                GiangVien x = gv.get(j);
                if (x.getMaGV().equals(mgv)){
                    String tmp = String.format("%s %.2f\n", x.getTenGV(), h);
                    hm.put(tmp, j);
                    res.add(tmp);
                    break;
                }
            }
        }
        
        Collections.sort(res, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return hm.get(o1) - hm.get(o2);
            }
        });
        
        for (String x : res){
            System.out.print(x); 
        }
        
    }
}
