package oop_lesson1.misol6;

import java.util.Scanner;

public class Misol6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        System.out.print("a:");
        a = scanner.nextDouble();
        System.out.print("b:");
        b = scanner.nextDouble();
        System.out.print("c:");
        c = scanner.nextDouble();
        System.out.print("d:");
        d = scanner.nextDouble();
        System.out.print("e:");
        e = scanner.nextDouble();
        System.out.print("f:");
        f = scanner.nextDouble();
        LinearEquation linearEquation = new LinearEquation(a,b,c,d,e,f);
        boolean res = linearEquation.isSolvable();
        x = linearEquation.getx();
        y = linearEquation.gety();
        System.out.println("Res:"+res);
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
