//Deriving Expresso class by extending it to the coffee class
package javaassignment.CoffeeMachine;

public class Expresso extends Coffee {
    //Declaring the ingredients
    public int milk;
    public int water;
    public int coffee;
    public int sugar;

    public Expresso(int milk, int water, int coffee, int sugar) {
        this.milk = milk;
        this.sugar = sugar;
        this.water = water;
        this.coffee = coffee;
    }

    @Override
    public void makingOfCoffee() {
        System.out.println(" Expresso " + " : " + " Milk " + milk + " water " + water + " sugar " + sugar + " coffee " + coffee);
    }
}
