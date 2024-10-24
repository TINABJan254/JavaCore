package luyen_tap_1;

public class Pair<T, S> {
    private T first;
    private S second;
    
    public Pair(T firstElement, S secondElement){
        this.first = firstElement;
        this.second = secondElement;
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

