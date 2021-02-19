package javaassignment.CoffeeMachine;

public class DriverClass {

    public static void main(String[] args){
        MakingOfCoffee makingOfCoffee= new MakingOfCoffee();

       Expresso expresso= new Expresso(5,5,10, 5);
       makingOfCoffee.makingOfCoffeeDone(expresso);

       Cappuchino cappuchino= new Cappuchino(5, 10, 0, 10);
       makingOfCoffee.makingOfCoffeeDone(cappuchino);

       Frappe frappe= new Frappe(0, 10, 0, 15);
       makingOfCoffee.makingOfCoffeeDone(frappe);
    }
}
