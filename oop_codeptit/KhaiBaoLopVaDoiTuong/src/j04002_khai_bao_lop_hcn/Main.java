package j04002_khai_bao_lop_hcn;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        String c = sc.next();
        Rectange a = new Rectange(w, h, c);
        if (a.getWidth() > 0 && a.getHeight() > 0){
            a.formatColor();
            System.out.printf("%.0f %.0f %s", a.findPerimeter(), a.findArea(), a.getColor());
        }
        else{
            System.out.println("INVALID");
        }
    }
}
