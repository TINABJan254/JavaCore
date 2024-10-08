package luyen_tap_1;

import java.util.*;

public class Matrix {
    private int[][] data;
    
    public Matrix(int n, int m, int[][] data){
        this.data = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                this.data[i][j] = data[i][j];
            }
        }
    }
    
    public void sortCol(int col){
        ArrayList<Integer> a = new ArrayList<>();
        
        for (int i = 0; i < data.length; i++) {
            a.add(data[i][col]); 
        }
        Collections.sort(a);
        
        for (int i = 0; i < data.length; i++){
            data[i][col] = a.get(i);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++){
                res.append(data[i][j] + " ");
            }
            if (i != data.length - 1){
                res.append("\n");
            }
        }
        return res.toString();
    }
}
