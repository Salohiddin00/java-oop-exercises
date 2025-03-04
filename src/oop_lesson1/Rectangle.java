package oop_lesson1;

public class Rectangle {
    double with;
    double height;
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
