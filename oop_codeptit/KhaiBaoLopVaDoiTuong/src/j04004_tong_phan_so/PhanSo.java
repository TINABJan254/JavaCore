package j04004_tong_phan_so;

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
    
    public PhanSo add(PhanSo other){
        PhanSo res = new PhanSo(this.tu * other.mau + this.mau * other.tu, this.mau * other.mau);
        res.rutGon();
        return res;
    }
    
    @Override
    public String toString(){
        return tu + "/" + mau;
    }
}
