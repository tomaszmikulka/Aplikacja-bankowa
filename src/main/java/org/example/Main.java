package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account user1 = new Account("Tomasz", "Mikułka", 123456678, "admin", "1234", 10000, 1111);

        System.out.println("Witamy w naszym banku!\n");
        System.out.println("Podaj nazwę użytkownika:");
        String login = sc.nextLine();
        System.out.println("Podaj hasło do swojego konta:");
        int password = sc.nextInt();
        if (password != 1234) {
            exit(0);
        }
        System.out.println("Witam");
    }
}