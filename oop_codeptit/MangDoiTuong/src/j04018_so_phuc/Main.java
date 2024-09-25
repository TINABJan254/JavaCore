package j04018_so_phuc;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            SoPhuc A = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc B = new SoPhuc(sc.nextInt(), sc.nextInt());
            SoPhuc C = (A.add(B)).mul(A);
            SoPhuc D = (A.add(B)).mul(A.add(B));
            
            System.out.println(C + ", " + D);   
        }
    }
}
