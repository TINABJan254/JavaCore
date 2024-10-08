package luyen_tap_1;

import java.util.*;

public class BaiTap {
    
    public static void process1(int p1, int p2, int p3){
        int[] burstTime = {p1, p2, p3};
        int n = 3;
        int[] tgianCho = new int[n];
        
        tgianCho[0] = 0;
        for (int i = 1; i < n; i++) {
            tgianCho[i] = burstTime[i - 1] + tgianCho[i - 1];
        }
        
        int tongTgianCho = 0;
        for (int i = 0; i < n; i++) {
            tongTgianCho += tgianCho[i];
        }
        
        float tb = (float) tongTgianCho / n;
        System.out.printf("Thời gian chờ đợi trung bình: %.2f\n", tb);
    }
    
    public static void process2(int p1, int p2, int p3, int quantum) {
        
        int[] burstTime = { p1, p2, p3 };
        int n = burstTime.length;
        int[] waitingTime = new int[n];
        int[] remainingTime = new int[n];
        for (int i = 0; i < n; i++) {
            remainingTime[i] = burstTime[i];
        }
        
        int currentTime = 0;  
        boolean done;         
        
        
        do {
            done = true;  
            
            for (int i = 0; i < n; i++) {
                if (remainingTime[i] > 0) {
                    done = false;  
                    
                    if (remainingTime[i] > quantum) {
                        
                        currentTime += quantum;
                        remainingTime[i] -= quantum;
                    } else {
                        
                        currentTime += remainingTime[i];
                        waitingTime[i] = currentTime - burstTime[i];
                        remainingTime[i] = 0;
                    }
                }
            }
        } while (!done);
        
        int totalWaitingTime = 0;
        for (int i = 0; i < n; i++) {
            totalWaitingTime += waitingTime[i];
        }
        
 
        float averageWaitingTime = (float) totalWaitingTime / n;
        System.out.printf("Thời gian chờ đợi trung bình (Round Robin): %.2f\n", averageWaitingTime);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1, p2, p3;
        p1 = sc.nextInt();
        p2 = sc.nextInt();
        p3 = sc.nextInt();
        process1(p1, p2, p3);
    }
}
