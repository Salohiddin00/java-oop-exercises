package oop_lesson1.misol4;

public class RegularPolygon {
    int n;
    double side;
    double x;
    double y;
    RegularPolygon(){
        n=3;
        side=1;
        x=0;
        y=0;
    }
    RegularPolygon(int n,double side){
        this.n=n;
        this.side=side;
    }
    RegularPolygon(int n,double side,double x,double y){
        this.n=n;
        this.side=side;
        this.x=x;
        this.y=y;
    }
    double getPerimetr(){
        return n*side;
    }
    double getArea(){
        return ((n*side*side)/(4*Math.tan(Math.PI/n)));
    }
}
