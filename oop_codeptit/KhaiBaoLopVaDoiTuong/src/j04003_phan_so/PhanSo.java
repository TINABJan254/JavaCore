package j04003_phan_so;

public class PhanSo {
    private long tu, mau;
    
    public PhanSo(long tu, long mau){
        this.tu = tu;
        this.mau = mau;
    }
    
    public long gcd(long a, long b){
        while (b != 0){
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    
    public void rutGon(){
        long u = gcd(this.tu, this.mau);
        this.tu /= u;
        this.mau /= u;
    }
    
    public String toString(){
        return tu + "/" + mau;
    }
    
}
