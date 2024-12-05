package j07071_ten_viet_tat;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Person> listPerson = new ArrayList<>();
        for (int i = 0; i < n; i++){
            listPerson.add(new Person(sc.nextLine()));
        }
        
        Collections.sort(listPerson,  new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                if (!o1.ten().equals(o2.ten())){
                    return o1.ten().compareTo(o2.ten());
                }
                return o1.ho().compareTo(o2.ho());
            }
        });
        
        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0){
            String tmp = sc.nextLine();
            String vt = "";
            for (int i = 0; i < tmp.length(); i++){
                if (tmp.charAt(i) != '.'){
                    vt += tmp.charAt(i);
                }
            }
            
            for (Person p : listPerson){
                boolean check = true;
                String vietTat = p.vietTat();
                if (vietTat.length() == vt.length()){
                    for (int i = 0; i < vt.length(); i++){
                        if (vietTat.charAt(i) != vt.charAt(i) && vt.charAt(i) != '*'){
                            check = false;
                            break;
                        }
                    }
                    if (check){
                        System.out.println(p);
                    }
                }
                
            }
        }        
    }
}
