package j04020_lop_pair;

public class Pair<T, U> {
    private T first;
    private U second;
    
    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }
    
    public boolean isPrime(){
        for (int i = 2; i <= (int)Math.sqrt((Integer)first); i++){
            if ((Integer)first % i == 0){
                return false;
            }
        }
        
        for (Integer i = 2; i <= Math.sqrt((Integer)second); i++){
            if ((Integer)second % i == 0){
                return false;
            }
        }
        return ((Integer)first > 1) && ((Integer)second > 1);
    }
    
    @Override
    public String toString(){
        return first + " " + second;
    }
}
