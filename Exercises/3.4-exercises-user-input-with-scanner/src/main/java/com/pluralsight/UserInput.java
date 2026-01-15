package com.pluralsight;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("What is your age?");
        int age = scanner.nextInt();

        System.out.println("\nHello " + name + "!");
        System.out.println("I am " + age + " years old.");

        if (age >= 18) {
            System.out.println("You are old!");

        } else {
            System.out.println("Ha you're a baby!");

        }

        scanner.close();
    }
}

