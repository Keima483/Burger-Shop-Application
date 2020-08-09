package com.keima;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Press 1 for Base Burger");
            System.out.println("Press 2 for Healthy Burger");
            System.out.println("Press 3 for Deluxe Burger");
            boolean choice = scanner.hasNextInt();
            if(choice) {

                int userChoice = scanner.nextInt();
                switch (userChoice) {

                    case 1: BaseBurger burger = new BaseBurger();
                        burger.baseBurgerOrder();
                        break;

                    case 2: HealthyBurger healthyBurger = new HealthyBurger();
                        healthyBurger.healthyBurgerOrder();
                        break;

                    case 3: DeluxBurger deluxBurger = new DeluxBurger();
                        deluxBurger.deluxeBurgerOrder();
                        break;

                    default:
                        System.out.println("Invalid Input");
                }

            } else {

                System.out.println("Invalid Input");
            }
            scanner.nextLine();
    }
}
