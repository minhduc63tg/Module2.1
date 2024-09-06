/*
 * @ (#) TestSV.java   1.0   8/30/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.exe10;


/*
 * @description:
 * @author: Le Minh Duc
 * @version: 1.0
 * @created: 8/30/2024 4:55 PM
 */

public class TestSVien {
    public static void main(String[] args) {
        SinhVien sv1= new SinhVien("111", "Le Minh Duc");
        SinhVien sv2= new SinhVien("112", "Nguyen Van An");
        SinhVien sv3= new SinhVien("113", "Duc Phu");
        SinhVien sv4= new SinhVien("114", "noname");
        SinhVien sv5= new SinhVien("115", "Hoang Thi D");
        SinhVien[] dsSV= {sv1, sv2, sv3, sv4, sv5};
        LopHocPhan lhp= new LopHocPhan("FIT", "Java", "NG Thi Hoang Khanh", "Java oop", dsSV);
        System.out.println(lhp);
    }
}
