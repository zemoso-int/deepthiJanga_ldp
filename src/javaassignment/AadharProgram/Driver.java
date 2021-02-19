package javaassignment.AadharProgram;

public class Driver {

    public static void main(String[] args){
        AadhaarCard aadhar=new AadhaarCard();
        aadhar.gasBill();
        aadhar.electricityBill();
        aadhar.panCard();
        aadhar.passportId();
        aadhar.setFatherName("JAVA");
        aadhar.setName("OOPS");
        aadhar.setDOB("1000");
        System.out.println("Name: " +aadhar.getName());
        System.out.println("Father Name: " +aadhar.getFatherName());
        System.out.println("Year Of Birth: " +aadhar.getDOB());
    }
}
