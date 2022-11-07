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
}

