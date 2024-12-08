package bai12;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        ArrayList<TheLoai> listTheLoai = new ArrayList<>();
        for (int i = 0; i < n; i++){
            listTheLoai.add(new TheLoai(String.format("TL%03d", i + 1), sc.nextLine()));
        }
        
        ArrayList<Phim> listPhim = new ArrayList<>();
        for (int i = 0; i < m; i++){
            String maTheLoai = sc.nextLine();
            String ngayChieu = sc.nextLine();
            String tenPhim = sc.nextLine();
            int soTap = sc.nextInt();
            sc.nextLine();
            TheLoai theLoai = null;
            for (TheLoai tl : listTheLoai){
                if (tl.getMaTheLoai().equals(maTheLoai)){
                    theLoai = tl;
                }
            }
            
            listPhim.add(new Phim(String.format("P%03d", i + 1), theLoai, ngayChieu, tenPhim, soTap));
        }   
        
        Collections.sort(listPhim, new Comparator<Phim>(){
            @Override 
            public int compare(Phim o1, Phim o2){
                if (!o1.getNgayChieu().equals(o2.getNgayChieu())){
                    return o1.getNgayChieu().compareTo(o2.getNgayChieu());
                } else if (!o1.getTenPhim().equals(o2.getTenPhim())){
                    return o1.getTenPhim().compareTo(o2.getTenPhim());
                }
                return o1.getSoTap() - o2.getSoTap();
            }
        });
        
        for (Phim x : listPhim){
            System.out.println(x);
        }
    }
}

