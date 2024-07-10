/*
    NAME:- ABHISHIKTH BODA
    COURSE:- OOP
    ASSIGNMENT NUMBER:- 5
    DATE:- 08-09-2022
*/

import java.util.*;

class Point {
    private int coordinateX;
    private int coordinateY;


    //DEFAULT CONSTRUCTOR
    public Point() {
        this.coordinateX = 0;
        this.coordinateY = 0;
    }


    //ONE ARGUMENT CONSTRUCTOR
    public Point(int coordinateX) {
        this.coordinateX = coordinateX;
    }


    //TWO ARGUMENT CONSTRUCTOR
    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public void setCoordinateX(int coordinateX) {
        if ((coordinateX > 0) || (coordinateX < 15)) {
            this.coordinateX = coordinateX;
        } else {
            System.out.printf("*****ERROR*****\n*****ERROR*****\nInput is Wrong\n");
        }
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateY(int coordinateY) {
        if ((coordinateY > 0) || (coordinateY < 15)) {
            this.coordinateY = coordinateY;
        } else {
            System.out.printf("*****ERROR*****\n*****ERROR*****\nInput is Wrong\n");
        }
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void setPoint(int coordinateX, int coordinateY) {
        if (((coordinateX > 0) || (coordinateX < 15)) && ((coordinateY > 0) || (coordinateY < 15))) {
            this.coordinateX = coordinateX;
            this.coordinateY = coordinateY;
        } else {
            System.out.printf("*****ERROR*****\n*****ERROR*****\nInput is Wrong\n");
        }
    }

    public void print() {
        System.out.println("****************************************");
        System.out.println("X coordinate of the point is " + getCoordinateX());
        System.out.println("Y coordinate of the point is " + getCoordinateY());
        System.out.println("****************************************");
    }
}

class Rectangle {
    private Point pointOne;
    private Point pointTwo;

    public Rectangle(Point p1, Point p2) {
        this.pointOne = p1;
        this.pointTwo = p2;
    }

    public int getHeight() {
        int height;
        height = Math.abs(pointOne.getCoordinateY() - pointTwo.getCoordinateY());
        return height;
    }

    public int getWidth() {
        int width;
        width = Math.abs(pointOne.getCoordinateX() - pointTwo.getCoordinateX());
        return width;
    }

    public int getAreaRectangle() {
        int area;
        area = getHeight() * getWidth();
        return area;
    }

    public boolean isSmaller(Rectangle r) {
        if (getAreaRectangle() > r.getAreaRectangle()) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println("****************************************");
        System.out.println("These are the attributes of the given Rectangle");
        System.out.print("Point One of the Rectangle is :- \n");
        pointOne.print();
        System.out.print("\nPoint Two of the Rectangle is :- \n");
        pointTwo.print();
        System.out.println("Height of the Rectangle is :- " + getHeight());
        System.out.println("Width of the Rectangle is :- " + getWidth());
        System.out.println("Area of the Rectangle is :- " + getAreaRectangle());
        System.out.println("****************************************");
    }

    public boolean isSmallerCircle(Circle c) {
        if (getAreaRectangle() > c.getAreaCircle()) {
            return true;
        } else {
            return false;
        }
    }
}

class Circle {
    private Point pointCenter;
    private int radius;

    public Circle(Point p, int radius) {
        this.pointCenter = p;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getAreaCircle() {
        double area;
        area = (Math.PI) * (getRadius()) * (getRadius());
        return area;
    }

    public boolean isSmaller(Circle c) {
        if (getAreaCircle() > c.getAreaCircle()) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {
        System.out.println("****************************************");
        System.out.println("These are the attributes of the Circle:-");
        System.out.print("Center of the Circle is :- \n");
        pointCenter.print();
        System.out.println("Radius of the Circle is:- " + getRadius());
        System.out.println("Area of the Circle is:- " + getAreaCircle());
        System.out.println("****************************************");
    }

    public boolean isSmallerRectangle(Rectangle r) {
        if (getAreaCircle() > r.getAreaRectangle()) {
            return true;
        } else {
            return false;
        }
    }
}

public class ShapeComparisionMain_S20210010044 {

    public static void sortRectangles(Rectangle[] r) {
        int n = r.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (r[j].isSmaller(r[j + 1])) {
                    Rectangle temp = r[j];
                    r[j] = r[j + 1];
                    r[j + 1] = temp;
                }
            }
        }
    }

    public static void sortCircles(Circle[] c) {
        int n = c.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (c[j].isSmaller(c[j + 1])) {
                    Circle temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {


        System.out.printf("NAME:- ABHISHIKTH BODA\nCOURSE:- OOP\nASSIGNMENT NUMBER:- 5\nDATE:- 08-09-2022\n\n");

        Point p1 = new Point(6, 8);
        Point p2 = new Point(2, 6);
        Point p3 = new Point(9, 3);
        Point p4 = new Point(10, 7);
        Point p5 = new Point(5, 10);
        Point p6 = new Point(7, 14);
        Rectangle[] r = new Rectangle[5];
        Circle[] c = new Circle[5];

        

        r[0] = new Rectangle(p3, p5);
        r[1] = new Rectangle(p1, p6);
        r[2] = new Rectangle(p4, p2);
        r[3] = new Rectangle(p6, p3);
        r[4] = new Rectangle(p2, p1);
        c[0] = new Circle(p2, 7);
        c[1] = new Circle(p5, 6);
        c[2] = new Circle(p1, 8);
        c[3] = new Circle(p3, 5);
        c[4] = new Circle(p6, 2);

        System.out.println("****************************************");

        System.out.println("Details of rectangles before sorting:-");

        for (Rectangle rt : r) {
            rt.print();
        }

        System.out.println("****************************************");

        System.out.println("Details of circles before sorting:-");

        for (Rectangle rt : r) {
            rt.print();
        }

        System.out.println("****************************************");

        System.out.println("*****Comparing rectangles 4 and 2*****");
        r[3].print();
        r[1].print();
        System.out.println(r[3].isSmaller(r[1]));

        System.out.println("****************************************");

        System.out.println("*****Comparing rectangles 3 and 1*****");
        r[2].print();
        r[0].print();
        System.out.println(r[2].isSmaller(r[0]));

        System.out.println("****************************************");

        System.out.println("*****Comparing circles 2 and 4*****");
        c[1].print();
        c[3].print();
        System.out.println(c[1].isSmaller(c[3]));

        System.out.println("****************************************");

        System.out.println("*****Comparing circles 1 and 3*****");
        c[0].print();
        c[2].print();
        System.out.println(c[0].isSmaller(c[2]));

        System.out.println("****************************************");

        System.out.println("*****Comparing circle 2 and rectangle 4*****");
        c[1].print();
        r[3].print();
        System.out.println(c[1].isSmallerRectangle(r[3]));

        System.out.println("****************************************");

        System.out.println("*****Comparing circle 5 and rectangle 1*****");
        c[4].print();
        r[0].print();
        System.out.println(c[4].isSmallerRectangle(r[0]));

        System.out.println("****************************************");

        System.out.println("*****Comparing rectangle 4 and circle 5*****");
        r[3].print();
        c[4].print();
        System.out.println(r[3].isSmallerCircle(c[4]));

        System.out.println("****************************************");

        System.out.println("*****Comparing rectangle 1 and circle 3*****");
        r[0].print();
        c[2].print();
        System.out.println(r[0].isSmallerCircle(c[2]));

        System.out.println("****************************************");

        System.out.println("Details of rectangles after sorting:-");

        sortRectangles(r);
        for (Rectangle rt : r) {
            rt.print();
        }

        System.out.println("****************************************");

        System.out.println("Details of circles after sorting:-");

        sortCircles(c);
        for (Circle c1 : c) {
            c1.print();
        }

        System.out.println("******************THE END**********************");
    }
}