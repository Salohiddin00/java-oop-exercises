package oop_lesson1;

public class Accaunt {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Accaunt() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    public Accaunt(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }


    public void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Yetarli mablag' mavjud emas!");
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }
}
