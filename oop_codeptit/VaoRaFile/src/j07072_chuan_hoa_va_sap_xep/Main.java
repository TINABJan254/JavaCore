package j07072_chuan_hoa_va_sap_xep;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> listName = new ArrayList<>();
        while (sc.hasNextLine()){
            listName.add(new Name(sc.nextLine().trim()));
        }
        
        Collections.sort(listName, new Comparator<Name>(){
            @Override
            public int compare(Name o1, Name o2){
                if (!o1.lastName().equals(o2.lastName())){
                    return o1.lastName().compareTo(o2.lastName());
                }
                return o1.firstName().compareTo(o2.firstName());
            }
        });
        
        for (Name name : listName){
            System.out.println(name);
        }
    }
}
