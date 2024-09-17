package j04008_chu_vi_tam_giac;

public class Triangle {
    private Point A, B, C;
    private double AB, BC, AC;
    
    public Triangle(Point A, Point B, Point C){
        this.A = A;
        this.B = B;
        this.C = C;
        AB = A.distance(B);
        BC = B.distance(C);
        AC = A.distance(C);
    }
    
    public boolean isValid(){
        if (AB + AC <= BC || AB + BC <= AC || BC + AC <= AB){
            return false;
        }
        return true;
    }
    
    public double findArea(){
        return (AB + BC + AC);
    }
    
}
