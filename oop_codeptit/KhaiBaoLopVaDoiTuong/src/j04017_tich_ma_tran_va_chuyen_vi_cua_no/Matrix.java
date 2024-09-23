package j04017_tich_ma_tran_va_chuyen_vi_cua_no;

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
                for (int k = 0; k < this.a[0].length; k++) {
                    res.a[i][j] += this.a[i][k] * other.a[k][j];
                }
            }
        }
        
        return res;
    }
    
    public Matrix trans(){
        Matrix res = new Matrix(this.a[0].length, this.a.length);
        
        for (int i = 0; i < this.a.length; i++){
            for (int j = 0; j < this.a[0].length; j++){
                res.a[j][i] = this.a[i][j];
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
            
            if (i != a.length - 1){
                res += "\n";
            }
        }
        return res;
    }
}
