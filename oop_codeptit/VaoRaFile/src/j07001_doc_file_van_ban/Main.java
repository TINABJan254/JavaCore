package j07001_doc_file_van_ban;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
