package j05032_tre_nhat_gia_nhat;

public class Person {
    private String name, birthday;
    
    public Person(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }
    
    public String getYear(){
        int i = birthday.length() - 1;
        while (birthday.charAt(i) != '/'){
            --i;
        }
        return birthday.substring(i + 1);
    }
    
    public String getMonth(){
        int i = 0; 
        while (birthday.charAt(i) != '/'){
            ++i;
        }
        return birthday.substring(i + 1, i + 3);
    }
    
    public String getDay(){
        return birthday.substring(0, 2);
    }
    
    @Override
    public String toString(){
        return name;
    }
}
