package j04016_tich_hai_doi_tuong_ma_tran;

import java.util.*;

public class Matrix {
    private int[][] a;
    
    public Matrix(){
        a = new int[1][1];
    }
    
    public Matrix(int n, int m){
        a = new int[n][m];
    }
    
    public void nextMatrix(Scanner sc){
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                a[i][j] = sc.nextInt();
            }
        }
    }
    
    public Matrix mul(Matrix other){
        Matrix res = new Matrix(this.a.length, other.a[0].length);
        
        for (int i = 0; i < this.a.length; i++){
            for (int j = 0; j < other.a[0].length; j++){
                res.a[i][j] = 0;
                for (int k = 0; k < this.a[0].length; k++){
                    res.a[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        
        return res;
    }
    
    @Override
    public String toString(){
        String res = "";
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                res += a[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }
}
