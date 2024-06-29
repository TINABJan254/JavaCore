package basic;

import java.util.Scanner;

public class XepLoaiHocSinh {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Double x, y, z, t;
        x = sc.nextDouble();
        y = sc.nextDouble();
        z = sc.nextDouble();
        t = sc.nextDouble();
        Double res = (x + y + z*2 + 3*t) / 7;
        if (res >= 8.0)
            System.out.println("GIOI");
        else if (res >= 6.5)
            System.out.println("KHA");
        else if (res >= 5)
            System.out.println("TRUNG BINH");
        else
            System.out.println("YEU");
    }
}
