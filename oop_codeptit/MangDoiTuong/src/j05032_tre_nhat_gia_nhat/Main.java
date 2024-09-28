package j05032_tre_nhat_gia_nhat;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            Person x = new Person(sc.next(), sc.next());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                if (!o1.getYear().equals(o2.getYear())){
                    return o1.getYear().compareTo(o2.getYear());
                }
                else if (!o1.getMonth().equals(o2.getMonth())){
                    return o1.getMonth().compareTo(o2.getMonth());
                }
                return o1.getDay().compareTo(o2.getDay());
            }
        });
        
        System.out.println(a.get(a.size() - 1));
        System.out.println(a.get(0));
    }
}
