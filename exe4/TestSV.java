/*
 * @ (#) TestSV.java   1.0   8/30/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.exe4;


/*
 * @description:
 * @author: Le Minh Duc
 * @version: 1.0
 * @created: 8/30/2024 4:19 PM
 */

import java.util.Scanner;

public class TestSV {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("%10s    %-20s%10s%10s%10s\n", "Ma SV", "Ho Ten", "DiemLT", "DiemTH", "DiemTB");
        DiemSinhVien sv1= new DiemSinhVien(11, "Le Minh Duc", 9.0f, 8.0f);
        System.out.println(sv1);

        DiemSinhVien sv2= new DiemSinhVien();
        System.out.println("Nhap MSSS: ");
        sv2.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap Ho Ten: ");
        sv2.setHoTen(sc.next());
        System.out.println("Nhap Diem LT: ");
        sv2.setLT(sc.nextFloat());
        System.out.println("Nhap Diem TH: ");
        sv2.setTH(sc.nextFloat());

        System.out.println(sv2);

    }
}
