package oop_lesson1.misol4;

public class Misol4 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon1 = new RegularPolygon(6, 4);
        double perimetr1 = regularPolygon1.getPerimetr();
        double yuz1 = regularPolygon1.getArea();
        System.out.printf("Perimetr1: %f,Yuzi1: %f",perimetr1,yuz1);
        System.out.println();
        RegularPolygon regularPolygon2 = new RegularPolygon(10,4,5.6,7.8);
        double perimetr2 = regularPolygon2.getPerimetr();
        double yuz2 = regularPolygon2.getArea();
        System.out.printf("Perimetr1: %f,Yuzi1: %f",perimetr2,yuz2);
    }
}