package j07060_sap_xep_lich_thi;

import java.util.*;
import java.io.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException{
        Scanner sc1 = new Scanner(new File("MONTHI.in"));
        Scanner sc2 = new Scanner(new File("CATHI.in"));
        Scanner sc3 = new Scanner(new File("LICHTHI.in"));
        
//        Scanner sc1 = new Scanner(System.in);
//        Scanner sc2 = new Scanner(System.in);
//        Scanner sc3 = new Scanner(System.in);
        
        ArrayList<MonThi> listMonThi = new ArrayList<>();
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i = 0; i < n; i++){
            listMonThi.add(new MonThi(sc1.nextLine().trim(), sc1.nextLine().trim(), sc1.nextLine().trim()));
        }
        
        int m = sc2.nextInt();
        sc2.nextLine();
        ArrayList<CaThi> listCaThi = new ArrayList<>();
        for (int i = 0; i < m; i++){
            listCaThi.add(new CaThi(String.format("C%03d", i + 1), sc2.nextLine().trim(), sc2.nextLine().trim(), sc2.nextLine().trim()));
        }
        
        int k = sc3.nextInt();
        ArrayList<LichThi> listLichThi = new ArrayList<>();
        for (int i = 0; i < k; i++){
            String maCa = sc3.next().trim();
            String maMon = sc3.next().trim();
            String maNhom = sc3.next().trim();
            int soLuong = sc3.nextInt();
            
            CaThi caThi = null;
            MonThi monThi = null;
            
            for (CaThi ct : listCaThi){
                if (ct.getMaCa().equals(maCa)){
                    caThi = ct;
                }
            }
            
            for (MonThi mt : listMonThi){
                if (mt.getMaMon().equals(maMon)){
                    monThi = mt;
                    break;
                }
            }
            
            listLichThi.add(new LichThi(caThi, monThi, maNhom, soLuong));
        }
        
        Collections.sort(listLichThi, new Comparator<LichThi>(){
            @Override
            public int compare(LichThi o1, LichThi o2){
                if (!o1.getCaThi().getNgayThi().equals(o2.getCaThi().getNgayThi())){
                    return o1.getCaThi().getNgayThi().compareTo(o2.getCaThi().getNgayThi());
                } else if (!o1.getCaThi().getGioThi().equals(o2.getCaThi().getGioThi())){
                    return o1.getCaThi().getGioThi().compareTo(o2.getCaThi().getGioThi());
                }
                return o1.getCaThi().getMaCa().compareTo(o2.getCaThi().getMaCa());
            }
        });
        
        for (LichThi x : listLichThi){
            System.out.println(x);
        }
    }
}