package j04014_tinh_toan_phan_so;

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
        if (this.mau < 0){
            this.mau = Math.abs(this.mau);
            this.tu *= -1;
        }
    }
    
    public PhanSo add(PhanSo other){
        PhanSo res = new PhanSo(1, 1);
        res.tu = this.tu * other.mau + this.mau * other.tu;
        res.mau = this.mau * other.mau;
        
        res.rutGon();
        return res;
    }
    
    public PhanSo mul(PhanSo other){
        PhanSo res = new PhanSo(1, 1);
        res.tu = this.tu * other.tu;
        res.mau = this.mau * other.mau;
        
        res.rutGon();
        return res;
    }
    
    public String toString(){
        return tu + "/" + mau;
    }
}
