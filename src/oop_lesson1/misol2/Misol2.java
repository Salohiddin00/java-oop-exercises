package oop_lesson1.misol2;

public class Misol2 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL","Oracle Corporation",34.5,34.35);
        double foiz=stock.getChangePercent();
        System.out.println("Natija:"+foiz);
    }
}
