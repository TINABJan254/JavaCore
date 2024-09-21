package j04010_dien_tich_hinh_tron_ngoai_tiep_tam_giac;

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
        double p = (AB + AC + BC) / 2.0;
        return Math.sqrt(p * (p - AB) * (p - AC) * (p - BC));
    }
    
    public double findRadius(){
        return (AB * BC * AC) / (4 * findArea());
    }
}
