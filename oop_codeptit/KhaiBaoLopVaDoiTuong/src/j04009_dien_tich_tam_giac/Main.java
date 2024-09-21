package j04009_dien_tich_tam_giac;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            Triangle x = new Triangle(new Point(sc.nextDouble(), sc.nextDouble()), new Point(sc.nextDouble(), 
                    sc.nextDouble()), new Point(sc.nextDouble(), sc.nextDouble()));
            if (x.isValid()){
                System.out.printf("%.2f\n", x.findArea());
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
