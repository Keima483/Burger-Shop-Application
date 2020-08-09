package com.keima;

import java.util.Scanner;

public class BaseBurger {

    private double priceOfTheBurger ;
    private int numberOfLayers ;

    public BaseBurger() {

        this.priceOfTheBurger = 50;
        this.numberOfLayers = 0;
        System.out.println("A base burger is ordered\n") ;
    }
    public double basePriceOfBaseBurger() {

        return 50.0;
    }

    public void addSalad() {

        addLayer(10 , "Salad");
    }
    public void addCheese() {

        addLayer(15, "Cheese");
    }
    public void addMayonnaise() {

        addLayer(5, "Mayonnaise");
    }
    public void addLettuce() {

        addLayer(10, "lettuce");
    }
    public void addExtraHam() {

        addLayer(20, "Extra Ham");
    }
    public void addOnion() {

        addLayer(5,"Onion");
    }
    public void addLayer(int price , String addition) {

        this.numberOfLayers += 1;
        this.priceOfTheBurger += price ;
        System.out.println("\n" +addition + " added of price Rs " + price  );
        System.out.println("The price till now is " + priceOfTheBurger + "\n");
    }

    public double getPriceOfTheBurger() {
        return priceOfTheBurger;
    }

    public int getNumberOfLayers() {
        return numberOfLayers;
    }

    public void setPriceOfTheBurger(double priceOfTheBurger) {
        this.priceOfTheBurger = priceOfTheBurger;
    }

    public void setNumberOfLayers(int numberOfLayers) {
        this.numberOfLayers = numberOfLayers;
    }

    public void baseBurgerOrder() {

        Scanner sc = new Scanner(System.in);
        int  i = 0;
        while (i<4) {

            System.out.println("Press 1 to add Salad");
            System.out.println("Press 2 to add Cheese");
            System.out.println("Press 3 to add Mayonnaise");
            System.out.println("Press 4 to add Lettuce");
            System.out.println("Press 5 to add Extra Ham");
            System.out.println("Press 6 to add Onion");
            System.out.println("press 0 to add nothing\n");

            boolean input = sc.hasNextInt();
            if(input) {

                int choice = sc.nextInt();
                switch (choice) {

                    case 0: i += 1;
                        System.out.println("\nNothing added\n");
                        break;

                    case 1 : addSalad();
                        i += 1;
                        break;

                    case 2 : addCheese();
                        i += 1;
                        break;

                    case 3 : addMayonnaise();
                        i += 1;
                        break;

                    case 4 : addLettuce();
                        i += 1;
                        break;

                    case 5 : addExtraHam();
                        i += 1;
                        break;

                    case 6 : addOnion();
                        i += 1;
                        break;

                    default:
                        System.out.println("Invalid Input");
                }
            }
            else {
                System.out.println("Invalid Input");
            }
            sc.nextLine();
        }
        System.out.println("So the total price of the burger is rs " + this.priceOfTheBurger + " with " + this.numberOfLayers + " layers\n");
    }

}
