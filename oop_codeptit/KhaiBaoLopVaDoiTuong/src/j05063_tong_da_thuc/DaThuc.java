package j05063_tong_da_thuc;

public class DaThuc {
    private int[] a;
    
    public DaThuc(){
    }
    
    public static int bac(String s){
        int i = s.length() - 1;
        while (s.charAt(i) != '^'){
            --i;
        }
        return Integer.parseInt(s.substring(i + 1));
    }
    
    public static int heso(String s){
        int i = 0;
        while (s.charAt(i) != '*'){
            ++i;
        }
        return Integer.parseInt(s.substring(0, i));
    }
    
    public DaThuc(String s){
        String tmp = "";
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != '+'){
                tmp += s.charAt(i);
            }
            else{
                tmp += ' ';
            }
        }
        
        String[] t = tmp.split("\\s+");
        a = new int[bac(t[0]) + 1];
        for (int i = 0; i < t.length; i++){
            a[bac(t[i])] = heso(t[i]);
        }
    }
    
    public DaThuc cong(DaThuc other){
        DaThuc res = new DaThuc();
        
        int bac1 = (int)Math.min(this.a.length, other.a.length); //bac da thuc nho hon
        int bac2 = (int)Math.max(this.a.length, other.a.length); //bac da thuc lon hon
        
        res.a = new int[bac2];
        
        for (int i = 0; i < bac2; i++){
            if (i < this.a.length){
                res.a[i] = this.a[i];    
            }
            if (i < other.a.length){
                res.a[i] += other.a[i];
            }
        }
        
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        for (int i = a.length - 1; i >= 0; i--){
            if (a[i] != 0){
                res += String.format("%d*x^%d", a[i], i);
                if (i != 0){
                    res += " + ";
                }
            }
            
        }
        
        return res;
    }
}
