package basic;

import java.util.*;

class Thread1 extends Thread{
    public static boolean nt(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return n > 1;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            if (nt(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}

class Thread2 extends Thread{
    public static boolean hoanHao(int n) {
        int s = 1;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                s += i;
                if (n / i != i ){
                    s += n / i;
                }
            }
        }
        return s == n;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            if (hoanHao(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}

class Thread3 extends Thread{
    @Override
    public void run(){
        for (int i = 1; i <= 2000; i++){
            if (i % 3 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}

public class BaiTap {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
