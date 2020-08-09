package com.keima;

public class DeluxBurger {

    private double priceOfBurger ;

    public DeluxBurger() {

        this.priceOfBurger = 80;
        System.out.println("A deluxe burger of Rs 80 is ordered ");
    }
    private void addDrink() {

        System.out.println("Added a Drink of Rs 40");
        this.priceOfBurger += 40 ;
    }
    private void addFries() {

        System.out.println("Added Fries of Rs 30");
        this.priceOfBurger += 30 ;
    }
    public void deluxeBurgerOrder() {

        addDrink();
        addFries();
        System.out.println("So your bill is of Rs " + this.priceOfBurger + " with a coke and fries") ;
    }
}
