package oop.lop_matrix;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Matrix {
    private int[][] a;
    
    public Matrix(){
        a = new int[100][];
    }
    
    public Matrix(int n, int m){
        a = new int[n][m];
    }
    
    public void nextMatrix(Scanner sc){
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                a[i][j] = sc.nextInt();
    }
    
    public Matrix mul(Matrix other){
        Matrix res = new Matrix(this.a.length, other.a[0].length);
        for (int i = 0; i < this.a.length; i++){
            for (int j = 0; j < other.a[0].length; j++){
                for (int k = 0; k < this.a[0].length; k++){
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
            for (int j = 0; j < a[0].length; j++)
                res += a[i][j] + " ";
            res += "\n";
        }
        return res;
    }
    
}
