package j05009_tim_thu_khoa_ki_thi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ThiSinh> a = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            ThiSinh x = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.add(x);
        }

        Collections.sort(a, new Comparator<ThiSinh>() {
            @Override
            public int compare(ThiSinh o1, ThiSinh o2) {
                if (o1.tongDiem() > o2.tongDiem()) {
                    return -1;
                } else if (o1.tongDiem() < o2.tongDiem()) {
                    return 1;
                }
                return o1.getId().compareTo(o2.getId());
            }
        });

        int i = 0;
        while (i < n - 2 && a.get(i).tongDiem() == a.get(i + 1).tongDiem()) {
            ++i;
        }
        
        for (int j = 0; j <= i; j++){
            System.out.println(a.get(j));
        }
    }
}
