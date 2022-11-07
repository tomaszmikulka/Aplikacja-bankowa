package org.example;

public class Account {
    private String firstName;
    private String lastName;
    private int pesel;
    private String login;
    private String account_number;
    private double balance;
    private int pin;

    Account (String firstName, String lastName, int pesel, String login, String account_number, double balance, int pin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.login = login;
        this.account_number = account_number;
        this.balance = balance;
        this.pin = pin;
    }
    public String getLogin() {
        return login;
    }
    public int getPin() {
        return pin;
    }
    public String getAccount_number(){
        return account_number;
    }
    public double withdraw(double cashToGet){
        return balance = balance - cashToGet;
    }
    public double getBalance(){
        return balance;
    }
    public  double deposit(double cashToPut){
        return balance = balance + cashToPut;
    }
    public double credit(double moneyToRent){
        double maxCredit = 0.1 * balance;
        if (moneyToRent < maxCredit) {
            return balance = balance + moneyToRent;
        }
        else {
            System.out.println("Nie możemy udzielić Ci tak wysokiego kredytu.");
            return balance;
        }
    }
}

