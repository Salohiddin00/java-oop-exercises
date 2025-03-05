package oop_lesson1.misol3;

public class Misol3 {
    public static void main(String[] args) {
        Accaunt account = new Accaunt(1122, 20000);

        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);
        account.printinfo();
    }
}