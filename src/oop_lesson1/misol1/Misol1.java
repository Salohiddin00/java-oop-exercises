package oop_lesson1.misol1;

public class Misol1 {
    public static void main(String[] args) {
//        Rectangle rectangle1 = new Rectangle(4,40);
//        double natija1=rectangle1.getArea();
//        double perimetr=rectangle1.getPerimetr();
//        System.out.println("Area1:"+natija1);
//        System.out.println("Perimetr1:"+perimetr);
//        System.out.println();
//        Rectangle rectangle2 = new Rectangle(3.5,35.9);
//        double natija2=rectangle2.getArea();
//        double perimetr2=rectangle2.getPerimetr();
//        System.out.println("Area2:"+natija2);
//        System.out.println("Perimert2:"+perimetr2);




        Rectangle rectangle = new Rectangle();
        double w=rectangle.getPerimetr();
        rectangle.height=3;
        rectangle.with=2;
        System.out.println("Turtburchak eni: "+rectangle.with+", buyi: "+rectangle.height);
        System.out.println(w);
        System.out.println(rectangle.getArea());



    }
}