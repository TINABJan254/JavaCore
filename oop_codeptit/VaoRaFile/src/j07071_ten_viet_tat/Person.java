package j07071_ten_viet_tat;

public class Person {
    private String hoTen;
    
    public Person(String hoTen){
        this.hoTen = hoTen;
    }
    
    public String ten(){
        String[] a = hoTen.split("\\s+");
        return a[a.length - 1].toLowerCase();
    }
    
    public String ho(){
        String[] a = hoTen.split("\\s+");
        String res = "";
        for (int i = 0; i < a.length - 1; i++){
            res += a[i].toLowerCase();
        }
        return res;
    }
    
    public String vietTat(){
        String[] a = hoTen.split("\\s+");
        String res = "";
        for (String x : a){
            res += Character.toUpperCase(x.charAt(0));
        }
        return res;
    }
    
    @Override
    public String toString(){
        return hoTen;
    }
}
