package oop_lesson1.misol5;

public class QuadraticEquation {
    double a;
    double b;
    double c;
    QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double getDiscriminant(){
        return (b*b-(4*a*c));
    }
    double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }
    double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}