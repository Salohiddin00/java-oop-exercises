package oop_lesson1;

public class Misol3 {
    public static void main(String[] args) {
        Accaunt account = new Accaunt(1122, 20000);

        account.setAnnualInterestRate(4.5);

        account.withdraw(2500);

        account.deposit(3000);

        System.out.printf("Balans: $%.2f\n", account.getBalance());
        System.out.printf("Oylik foiz stavkasi: %.2f%%\n", account.getMonthlyInterestRate());
        System.out.printf("Oylik foiz: $%.2f\n", account.getMonthlyInterest());
    }

}
