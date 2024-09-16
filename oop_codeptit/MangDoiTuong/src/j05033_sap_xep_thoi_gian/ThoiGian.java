package j05033_sap_xep_thoi_gian;

import java.util.*;
import java.math.*;

public class ThoiGian {
    private int gio, phut, giay;
    
    public ThoiGian(){
        gio = 0; phut = 0; giay = 0;
    }
    
    public ThoiGian(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }

    public int getGio() {
        return gio;
    }

    public int getPhut() {
        return phut;
    }

    public int getGiay() {
        return giay;
    }
    
    @Override
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
    
}
