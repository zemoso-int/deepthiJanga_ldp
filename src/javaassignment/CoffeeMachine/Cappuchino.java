//Deriving Cappuchino class using the coffee class
package javaassignment.CoffeeMachine;

public class Cappuchino extends Coffee {
    //Declaring the ingredients
    public int milk;
    public int water;
    public int coffee;
    public int sugar;

    public Cappuchino(int milk, int water, int sugar, int coffee) {
        this.sugar = sugar;
        this.coffee = coffee;
        this.milk = milk;
        this.water = water;
    }

    @Override
    public void makingOfCoffee() {
        System.out.println(" Cappuchino " + " : " + " Milk " + milk + " water " + water + " sugar " + sugar + " Coffee " + coffee);
    }


}
