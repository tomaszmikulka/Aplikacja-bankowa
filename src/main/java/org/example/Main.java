package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account user1 = new Account("Tomasz", "Mikułka", 123456678, "admin", "1234", 10000, 1234);


        System.out.println("Witamy w naszym banku!\n");

        boolean isLoginValid = false;
        do {
            System.out.println("Podaj swój login:");
            String login = sc.nextLine();
            if (!login.equals(user1.getLogin())) {
                System.out.println("Niepoprawny login");
                exit(0);
            } else {
                System.out.println("Poprawny login !\n");
                isLoginValid = true;
            }

        } while (!isLoginValid);

        boolean isPassValid = false;
        int iloscProb = 3;

        do {
            System.out.println("Podaj pin do swojego konta:");
            int pin = sc.nextInt();
            if (pin == user1.getPin()) {
                System.out.println("Poprawny PIN");
                isPassValid = true;
            } else {
                iloscProb--;
                if (iloscProb > 0) System.out.println("Niepoprawny PIN, pozostało " + iloscProb + "prób.");
                if (iloscProb == 0) {
                    System.out.println("Wykorzystałeś ilość prób.");
                    exit(0);
                }
            }
        } while (!isPassValid);
        int wybor;
        do {
            System.out.println("Witaj w swoim banku. Wybierz opcję: \n1. Wpłata\n2. Wypłata\n3. Sprawdzenie salda konta \n4. Weź kredyt\n5. Wyjście");
            System.out.println("Twój wybór: ");
            wybor = sc.nextInt();
            switch (wybor) {
                case 1:
                    // opcja pierwsza
                    System.out.println("Podaj jaką kwotę chcesz wpłacić:");
                    double wplata = sc.nextDouble();
                    user1.deposit(wplata);
                    System.out.println("Nowe saldo wynosi: " + user1.getBalance());
                    break;
                case 2:
                    // druga opcja
                    System.out.println("Podaj kwotę do wypłaty:");
                    double wyplata = sc.nextDouble();
                    user1.withdraw(wyplata);
                    System.out.println("Nowe saldo wynosi: " + user1.getBalance());
                    break;
                case 3:
                    // opcja trzecia
                    user1.getBalance();
                    System.out.println("Saldo wynosi: " + user1.getBalance());
                    break;
                case 4:
                    // druga czwarta
                    System.out.println("Ile pieniędzy chcesz pożyczyć?");
                    double kredyt = sc.nextDouble();
                    user1.credit(kredyt);
                    System.out.println("Saldo wynosi: " + user1.getBalance());
                    break;
                case 5:
                    System.out.println("Do widzenia!");
                    break;
                default:
                    System.out.println("Wybierz poprawną opcję");
            }
        } while (wybor != 5);
    }
}