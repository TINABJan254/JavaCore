package j04010_dien_tich_hinh_tron_ngoai_tiep_tam_giac;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            Triangle x = new Triangle(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), 
                    sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));
            if (x.isValid()){
                double r = x.findRadius();
                double res = Math.PI * r * r;
                System.out.printf("%.3f\n", res);
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
