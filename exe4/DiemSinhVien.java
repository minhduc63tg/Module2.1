/*
 * @ (#) DiemSinhVien.java   1.0   8/30/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.exe4;


/*
 * @description:
 * @author: Le Minh Duc
 * @version: 1.0
 * @created: 8/30/2024 4:07 PM
 */

public class DiemSinhVien {
    private int MaSV;
    private String HoTen;
    private float LT;
    private float TH;

    public DiemSinhVien() {
        this(0, "noname", 0.0f, 0.0f);
    }

    public DiemSinhVien(int ms, String name, float diemLT, float diemTH) {
        this.MaSV= ms;
        this.setMaSV(MaSV);
        this.HoTen= name;
        this.setHoTen(HoTen);
        this.LT= diemLT;
        this.setLT(LT);
        this.TH= diemTH;
        this.setTH(TH);
    }

    public int getMaSV() {
        return MaSV;
    }

    public void setMaSV(int maSV) {
        if(maSV < 0) {
            throw new IllegalArgumentException("Ma sinh vien phai lon hon 0");
        }
        MaSV = maSV;
    }
    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String hoTen) {
        if(hoTen == null || hoTen.trim().length()==0) {
            throw new IllegalArgumentException("Ho ten khong duoc de trong");
        }
        HoTen = hoTen;
    }

    public float getLT() {
        return LT;
    }

    public void setLT(float LT) {
        if(LT < 0 || LT > 10) {
            throw new IllegalArgumentException("Diem LT phai tu 0 den 10");
        }
        this.LT = LT;
    }

    public float getTH() {
        return TH;
    }

    public void setTH(float TH) {
        if(TH < 0 || TH > 10) {
            throw new IllegalArgumentException("Diem TH phai tu 0 den 10");
        }
        this.TH = TH;
    }

    public float getDTB() {
        return (LT + TH) / 2;
    }

    public String toString() {
        return String.format("%10d    %-20s%10.2f%10.2f%10.2f", MaSV, HoTen, LT, TH, getDTB());
    }
}
