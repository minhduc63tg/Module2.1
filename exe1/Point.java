/*
 * @ (#) Point.java   1.0   8/30/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */
package iuh.fit.exe1;


/*
 * @description:
 * @author: Le Minh Duc
 * @version: 1.0
 * @created: 8/30/2024 3:56 PM
 */

public class Point {
    private double x;
    private double y;
    private String name;

    public Point() {
        this(0.0,0.0,"");
    }
    public Point (double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%s(%.2f, %.2f)", name, x, y);
    }
}
