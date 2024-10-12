package j07046_danh_sach_luu_tru;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException{
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = sc.nextInt();
        ArrayList<Khach> a = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            sc.nextLine();
            Khach x = new Khach(i, sc.nextLine(), sc.next(), sc.next(), sc.next());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<Khach>(){
            @Override
            public int compare(Khach o1, Khach o2){
                return (int)(o2.soNgayLuuTru() - o1.soNgayLuuTru());
            }
        });
        
        for (Khach x : a){
            System.out.println(x);
        }   
    }
}
