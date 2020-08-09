package com.keima;

import java.util.Scanner;

public class HealthyBurger extends BaseBurger {

    public HealthyBurger() {

      setNumberOfLayers(0);
      setPriceOfTheBurger(60);
      System.out.println("A healthy burger is ordered");
    }

    public void addHealthySauce() {

        addLayer(20 , "Healthy Sauce");
    }

    public void addHealthyCheese() {

        addLayer(20 , "Healthy Cheese");
    }
    public void addHealthyVegetable() {

        addLayer(20 , "Healthy Vegetable");
    }

    public double basePriceOfHealthyBurger() {

        return 60.0;
    }
    public void healthyBurgerOrder() {

        Scanner scan = new Scanner(System.in) ;
        System.out.println("First choose your toppings from base burger list\n");
        super.baseBurgerOrder();
        System.out.println("You can now order from healthy burger addition list");
        int i = 0 ;
        while (i<2) {

            System.out.println("Press 0 to add nothing");
            System.out.println("Press 1 to add Healthy Sauce");
            System.out.println("Press 2 to add healthy Cheese");
            System.out.println("Press 3 to add Healthy Vegetable\n");

            boolean input = scan.hasNextInt();
            if(input) {

                int choice = scan.nextInt();
                switch (choice) {

                    case 0: i += 1;
                        System.out.println("\nNothing added\n");
                        break;

                    case 1 : addHealthySauce();
                        i += 1;
                        break;

                    case 2 : addHealthyCheese();
                        i += 1;
                        break;

                    case 3 : addHealthyVegetable();
                        i += 1;
                        break;

                    default:
                        System.out.println("Invalid Input");
                }
            }
            else {
                System.out.println("Invalid Input");
            }
            scan.nextLine();
        }
        scan.close();
        System.out.println("The final price is " + getPriceOfTheBurger() + " With " + getNumberOfLayers() + " layers");
    }
}
