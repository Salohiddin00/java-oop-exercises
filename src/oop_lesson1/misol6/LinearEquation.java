package oop_lesson1.misol6;

public class LinearEquation {
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double x;
    double y;
    LinearEquation(double a,double b,double c,double d,double e,double f){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
    }
    boolean isSolvable(){
        if((a*d)!=(b*c)){
            return true;
        }
        else {
            return false;
        }
    }
    double getx(){
        return ((e*d-b*f)/(a*d-b*c));
    }
    double gety(){
        return ((a*f-e*c)/(a*d-b*c));
    }

}
