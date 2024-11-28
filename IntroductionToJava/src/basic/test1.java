package basic;

import java.util.Scanner;

public class test1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = 4; // So tien trinh
        String[] p = {"P1", "P2", "P3", "P4"};
        int[] chuKyCpu = new int[n];//Do dai chu ky CPU
        int[] thoiGianCho = new int[n];// Thoi gian cho

        for (int i = 0; i < n; i++){
            System.out.print("Nhap do dai chu ky CPU cho tien trinh " + p[i] + ": ");
            chuKyCpu[i] = sc.nextInt();
        }

        
         // Sap xep tien trinh theo Burst Time tang dan (Selection Sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (chuKyCpu[i] > chuKyCpu[j]) {
                    int temp = chuKyCpu[i];
                    chuKyCpu[i] = chuKyCpu[j];
                    chuKyCpu[j] = temp;
                    
                    String tmp = p[i];
                    p[i] = p[j];
                    p[j] = tmp;
                }
            }
        }
        
        // Tinh thoi gian cho
        thoiGianCho[0] = 0; // Tien trinh dau tien khong co thoi gian cho
        for (int i = 1; i < n; i++) {
             thoiGianCho[i] = thoiGianCho[i - 1] + chuKyCpu[i - 1];
        }

        // Tinh thoi gian cho trung binh
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += thoiGianCho[i];
        }
        double thoiGianChoTrungBinh = (double) sum / n;
        
        for (int i = 0; i < n; i++){
            System.out.println("Thoi gian cho cua tien trinh " +  p[i] + ": " + thoiGianCho[i]);
        }
        
        System.out.print("Thu tu thuc hien theo thuat toan SPF: ");
        for (int i = 0; i < n; i++){
            System.out.print(p[i] + " ");
        }
        System.out.printf("\nThoi gian cho doi trung binh: %.2f", thoiGianChoTrungBinh);
        
    }
}
