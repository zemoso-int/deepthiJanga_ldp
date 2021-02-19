package javaassignment.AadharProgram;

public class AadhaarCard implements AddressProof, IdProof, AadharDetails {

    private String names;
    private String fatherNames;
    private String dobs;


    @Override
    public void gasBill() {

        System.out.println("Received the gas bill as a address proof");
    }

    @Override
    public void electricityBill() {

        System.out.println("Received the gas bill as a address proof");

    }

    @Override
    public void panCard() {

        System.out.println("Received pan card as a Id proof");
    }

    @Override
    public void passportId() {

        System.out.println("Received passport as a Id proof");
    }


    @Override
    public void setName(String name) {
        this.names = name;
    }

    @Override
    public String getName() {
        return this.names;
    }

    @Override
    public void setFatherName(String fatherName) {
        this.fatherNames = fatherName;
    }

    @Override
    public String getFatherName() {
        return this.fatherNames;
    }

    @Override
    public void setDOB(String dob) {
        this.dobs = dob;
    }

    @Override
    public String getDOB() {
        return this.dobs;
    }
}
