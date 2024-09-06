/*
 * @ (#) TestPoint.java   1.0   8/30/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.exe1;


/*
 * @description:
 * @author: Le Minh Duc
 * @version: 1.0
 * @created: 8/30/2024 4:03 PM
 */

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setName("A");
        Point p2 = new Point(6.0, 4.0, "B");
        System.out.println(p1);
        System.out.println(p2);
    }
}
