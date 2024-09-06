/*
 * @ (#) LopHocPhan.java   1.0   8/30/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.exe10;


/*
 * @description:
 * @author: Le Minh Duc
 * @version: 1.0
 * @created: 8/30/2024 4:44 PM
 */

public class LopHocPhan {
    private String maLHP;
    private String tenLHP;
    private String tenGV;
    private String thongtinLopHoc;
    private SinhVien[] dsSV;
    public LopHocPhan(String maLHP, String tenLHP, String tenGV, String thongtinLopHoc, SinhVien[] dsSV) {
        this.maLHP= maLHP;
        this.tenLHP= tenLHP;
        this.tenGV= tenGV;
        this.thongtinLopHoc= thongtinLopHoc;
        this.dsSV= dsSV;
    }
    public int getSoLuongSV(){
        return dsSV.length;
    }

    @Override
    public String toString() {
        String temp= "- Ma LHP: "+ maLHP+ "\n- Ten LHP: "+ tenLHP+ "\n- Ten GV: "+ tenGV+ "\n- Thong tin Lop Hoc: "
                + thongtinLopHoc+ "\n- Danh sach sinh vien: \n";
        for(SinhVien sv: dsSV) {
            temp += "\n"+ sv.toString();
        }
        temp += "\nTong so sinh vien: "+ getSoLuongSV();
        return temp;
    }
}
