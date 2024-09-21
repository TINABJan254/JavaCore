package j04012_bai_toan_tinh_cong;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien a = new NhanVien(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.next());
        System.out.println(a);
    }
}
