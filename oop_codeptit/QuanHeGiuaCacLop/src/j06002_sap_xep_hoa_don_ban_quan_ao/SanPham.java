/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j06002_sap_xep_hoa_don_ban_quan_ao;

public class SanPham {
    private String maLoai, tenSP;
    private long gia1, gia2;
    
    public SanPham(String maLoai, String tenSP, long gia1, long gia2){
        this.maLoai = maLoai;
        this.tenSP = tenSP;
        this.gia1 = gia1;
        this.gia2 = gia2;
    }
    
    public String getMaLoai(){
        return maLoai;
    }
    
    public long getGia1(){
        return gia1;
    }
    
    public long getGia2(){
        return gia2;
    }
    
    @Override
    public String toString(){
        return tenSP;
    }
}