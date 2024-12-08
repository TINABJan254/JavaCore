package bai5;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String line = sc.nextLine();
            Scanner lineScan = new Scanner(line);
            Stack<String> st = new Stack<>();
            while (lineScan.hasNext()){
                st.push(lineScan.next());
            }
            while (!st.isEmpty()){
                System.out.print(st.pop() + " ");
            }
            System.out.println("");
        }
    }
}
