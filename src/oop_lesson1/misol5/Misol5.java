package oop_lesson1.misol5;

import java.util.Scanner;

public class Misol5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a:");
        double a = scanner.nextDouble();
        System.out.print("b:");
        double b = scanner.nextDouble();
        System.out.print("c:");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double diskriminat = quadraticEquation.getDiscriminant();
        double ildiz1 = quadraticEquation.getRoot1();
        double ildiz2 = quadraticEquation.getRoot2();
        System.out.printf("Diskriminant: %f,Ildiz1: %f,Ildiz2: %f",diskriminat,ildiz1,ildiz2);
    }
}
