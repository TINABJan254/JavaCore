package j04019_lop_triangle_1;

import java.text.DecimalFormat;

public class Triangle {
    private Point A, B, C;
    
    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public boolean valid(){
        double AB = A.distance(B);
        double BC = B.distance(C);
        double AC = A.distance(C);
        if (AB + AC <= BC || AB + BC <= AC || BC + AC <= AB){
            return false;
        }
        return true;
    }
    
    public String getPerimeter(){
        double AB = A.distance(B);
        double BC = B.distance(C);
        double AC = A.distance(C);
        return String.format("%.3f", AB + BC + AC);
    }
    
}
