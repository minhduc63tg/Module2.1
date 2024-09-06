/*
 * @ (#) SinhVien.java   1.0   8/30/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.exe10;


/*
 * @description:
 * @author: Le Minh Duc
 * @version: 1.0
 * @created: 8/30/2024 4:46 PM
 */

public class SinhVien {
    private String maSV;
    private String hoTen;
    public SinhVien(String maSV, String hoTen) {
        this.maSV= maSV;
        this.hoTen= hoTen;
    }
    public String getMaSV() {
        return maSV;
    }
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    @Override
    public String toString() {
        return String.format("%-10s%-20s", maSV, hoTen);
    }
}
