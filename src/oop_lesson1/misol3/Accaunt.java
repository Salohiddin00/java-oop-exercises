package oop_lesson1.misol3;

public class Accaunt {
    int id;
    double balance;
    double annualInterestRate;

    Accaunt(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    void setId(int id) {
        this.id = id;
    }

    double getBalance() {
        return balance;
    }


    void setAnnualInterestRate(double rate) {
        this.annualInterestRate = rate;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Mablag' kam");
        }
    }

    void deposit(double amount) {
        balance += amount;
    }
}