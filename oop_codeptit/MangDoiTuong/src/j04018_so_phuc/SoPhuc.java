package j04018_so_phuc;

public class SoPhuc {
    private int a, b;
    
    public SoPhuc(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    public SoPhuc add (SoPhuc other){
        return new SoPhuc(this.a + other.a, this.b + other.b);
    }
    
    public SoPhuc mul (SoPhuc other){
        return new SoPhuc(this.a * other.a - this.b * other.b, this.a * other.b + this.b * other.a);
    }
    
    @Override
    public String toString(){
        String res = a + "";
        if (b < 0){
            res += String.format(" - %di", b * -1);
        }
        else{
            res += String.format(" + %di", b);
        }
        
        return res;
    }
}
