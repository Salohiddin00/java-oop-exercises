package oop_lesson1.misol3;

public class Accaunt {
    int id;
    double balance;
    double annualInterestRate;

    Accaunt() {
        id = 0;
        balance = 0;
        annualInterestRate=0;
    }
    Accaunt(int id,double balance){
        this.id=id;
        this.balance=balance;
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
        return 0;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    void deposit(double amount) {
        balance += amount;
    }
    void printinfo(){
        System.out.printf("Accaunt: %d, balanc: %f, annualInterestRate: %f",id,balance,annualInterestRate);
    }
}