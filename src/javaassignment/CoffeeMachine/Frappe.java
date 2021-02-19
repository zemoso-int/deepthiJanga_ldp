//Declaring Frappe class by extending the Coffee class
package javaassignment.CoffeeMachine;

public class Frappe extends Coffee {
    //Declaring the ingredients
    public int milk;
    public int water;
    public int coffee;
    public int sugar;

    public Frappe(int milk, int water, int sugar, int coffee) {
        this.sugar = sugar;
        this.milk = milk;
        this.water = water;
        this.coffee = coffee;
    }

    @Override
    public void makingOfCoffee() {
        System.out.println(" Frappe " + " : " + " Milk " + milk + " water " + water + " sugar " + sugar + " coffee " + coffee);

    }
}
