package j07072_chuan_hoa_va_sap_xep;

public class Name {
    private String fullName;
    
    public Name(String fullName){
        this.fullName = chuanHoa(fullName);
    }
    
    private String chuanHoa(String s){
        String[] a = s.toLowerCase().split("\\s+");
        StringBuilder res = new StringBuilder();
        for (String x : a){
            res.append(Character.toUpperCase(x.charAt(0)));
            res.append(x.substring(1)).append(" ");
        }
        return res.toString().trim();
    }
    
    public String firstName(){
        String[] a = fullName.split("\\s+");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length - 1; i++){
            res.append(a[i]).append(" ");
        }
        return res.toString().trim();
    }
    
    public String lastName(){
        String[] a = fullName.split("\\s+");
        return a[a.length - 1];
    }
    
    @Override
    public String toString(){
        return this.fullName;
    }
}
