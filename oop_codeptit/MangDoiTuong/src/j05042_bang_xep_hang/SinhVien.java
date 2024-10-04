package j05042_bang_xep_hang;

public class SinhVien {

    private String tenSV;
    private int AC, submit;

    public SinhVien(String tenSV, int AC, int submit) {
        this.tenSV = tenSV;
        this.AC = AC;
        this.submit = submit;
    }

    public int getAC() {
        return AC;
    }

    public int getSubmit() {
        return submit;
    }

    public String getTenSV() {
        return tenSV;
    }

    @Override
    public String toString() {
        return tenSV + " " + AC + " " + submit;
    }
}
