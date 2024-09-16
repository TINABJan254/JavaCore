package oop_codeptit.quan_he_giua_cac_lop;

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

public class J06001_TinhToanHoaDonBanQuanAo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SanPham> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            sc.nextLine();
            SanPham x = new SanPham(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            arr.add(x);
        }
        
        ArrayList<HoaDon> HD = new ArrayList<>();
        int m = sc.nextInt();
        for (int i = 0; i < m; i++){
            String id = sc.next();
            int SL = sc.nextInt();
            for (SanPham x : arr){
                if (x.getId().equals(id.substring(0, 2))){
                    HD.add(new HoaDon(id + "-" + String.format("%03d", i + 1), x, SL));
                }
            }
        }
        
        for (HoaDon x : HD){
            System.out.println(x);
        }
    }
    
}

class SanPham{
    private String id, ten;
    private long price1, price2;
    
    public SanPham(){
        id = ""; ten = "";
        price1 = 0; price2 = 0;
    }
    
    public SanPham(String id, String ten, long price1, long price2){
        this.id = id;
        this.ten = ten;
        this.price1 = price1;
        this.price2 = price2;
    }

    public String getTen() {
        return ten;
    }

    public String getId() {
        return id;
    }

    public long getPrice1() {
        return price1;
    }

    public void setPrice1(long price1) {
        this.price1 = price1;
    }

    public long getPrice2() {
        return price2;
    }

    public void setPrice2(long price2) {
        this.price2 = price2;
    }
    
    
}

class HoaDon{
    private String id;
    private SanPham sp;
    private long SL;
    
    public HoaDon(){
        id = "";
        sp = new SanPham();
        SL = 0;
    }
    
    public HoaDon(String id, SanPham sp, int SL){
        this.id = id;
        this.sp = sp;
        this.SL = SL;
    }
    
    public long getSubtotal(){
        if (id.charAt(2) == '1')
            return SL * sp.getPrice1();
        else
            return SL * sp.getPrice2();
    }
    
    public long getDiscount(){
        if (SL >= 150)
            return  (getSubtotal() * 50) / 100;
        else if (SL >= 100 )
            return (getSubtotal() * 30) / 100;
        else if (SL >= 50)
            return (getSubtotal() * 15) / 100;
        return 0;
    }
    
    public long getTotal(){
        return getSubtotal() - getDiscount();
    }
    
    @Override
    public String toString(){
        return id + " " + sp.getTen() + " " + getDiscount() + " " + getTotal();
    }
}

/*
Cửa hàng quần áo bán một số loại sản phẩm, mỗi loại được chia thành hai loại: loại 1 và loại 2 với giá bán khác nhau.
Loại sản phẩm được mô tả gồm: Mã loại: 2 chữ cái.
Tên sản phẩm.
Đơn giá loại 1.
Đơn giá loại 2.
Mỗi hóa đơn mua hàng sẽ có 2 thông tin: Mã hóa đơn, ban đầu chỉ có 3 ký tự.
Hai ký tự đầu tương ứng với mã loại.
Tiếp theo là chữ số 1 hoặc 2 cho biết loại sản phẩm.
Khi nhập dữ liệu, mã hóa đơn được bổ sung dấu gạch ngang và thứ tự hóa đơn, tính từ 001.
Số lượng mua.
Hãy lập bảng tính tiền phải trả cho mỗi hóa đơn, biết rằng hóa đơn có thể có giảm giá tính theo quy tắc sau:
Nếu số lượng >= 150 thì Giảm giá = 50% * Thành tiền.
Nếu số lượng >= 100 thì Giảm giá = 30% * Thành tiền.
Nếu số lượng >= 50 thì Giảm giá = 15% * Thành tiền.

Input:
Dòng đầu ghi số loại sản phẩm.
Thông tin về loại sản phẩm ghi trên 4 dòng gồm: mã, tên, giá loại 1, giá loại 2.
Tiếp theo là một dòng ghi số lượng hóa đơn.
Mỗi hóa đơn chỉ có 1 dòng ghi mã hóa đơn ban đầu (3 ký tự) và số lượng mua.

Output:
Ghi ra danh sách hóa đơn theo đúng thứ tự nhập gồm các thông tin:
Mã hóa đơn (đầy đủ).
Tên sản phẩm.
Số tiền giảm giá.
Số tiền phải trả.

Ví dụ

Input
2
AT
Ao thun
80000
45000
QJ
Quan Jean
220000
125000
2
AT1 95
QJ2 105

Output
AT1-001 Ao thun 1140000 6460000
QJ2-002 Quan Jean 7875000 18375000
*/