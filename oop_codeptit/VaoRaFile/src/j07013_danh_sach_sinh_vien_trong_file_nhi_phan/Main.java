package j07013_danh_sach_sinh_vien_trong_file_nhi_phan;

import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> listSinhVien = (ArrayList<SinhVien>) os1.readObject();
        for (SinhVien sinhVien : listSinhVien){
            System.out.println(sinhVien);
        }
    }
}
