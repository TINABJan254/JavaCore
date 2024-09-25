package j05011_tinh_gio;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<GameThu> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            GameThu x = new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
        }
        
        Collections.sort(a, new Comparator<GameThu>(){
            @Override
            public int compare(GameThu o1, GameThu o2){
                if (o1.getGioChoi() != o2.getGioChoi()){
                    return o2.getGioChoi() - o1.getGioChoi();
                }
                return o2.getPhutChoi() - o1.getPhutChoi();
            }
        });
        
        for (GameThu x : a){
            System.out.println(x);
        }
        
    }
}
