package oop_lesson1.misol1;

public class Rectangle {
    protected double with;
    protected double height;
    Rectangle(){
        with=1;
        height=1;
    }
    Rectangle(double with,double height){
        this.with=with;
        this.height=height;
    }
    double getArea(){
        return (with*height);
    }
    double getPerimetr(){
        return 2*(with+height);
    }

}