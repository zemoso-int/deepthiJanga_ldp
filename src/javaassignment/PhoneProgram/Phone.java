package javaassignment.PhoneProgram;
//Declaring a phone parent class
public class Phone {

    private String name;

    private String modelNumber;

    public void phone(String name, String modelNumber) {

        this.name = name;
        this.modelNumber = modelNumber;

    }

    public String getName() {

        return name;
    }

    public String getModelNumber() {

        return modelNumber;
    }

}
