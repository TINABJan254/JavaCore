package j07021_chuan_hoa_xau_ho_ten_trong_file;

import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;

public class J07021 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            if (line.equals("END")){
                break;
            }
            Scanner lineScan = new Scanner(line);
            String res = "";
            while (lineScan.hasNext()){
                String token = lineScan.next();
                res += Character.toUpperCase(token.charAt(0));
                for (int i = 1; i < token.length(); i++){
                    res += Character.toLowerCase(token.charAt(i));
                }
                res += " ";
            }
            res = res.trim();
            System.out.println(res);
        }
    }
}
