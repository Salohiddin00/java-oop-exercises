package oop_lesson1;

public class Misol2 {
    public static void main(String[] args) {
        Stock stock = new Stock("Aksiya","Bozor",25,30);
        double foiz=stock.getChangePercent();
        System.out.println("Natija:"+foiz);
    }
}
