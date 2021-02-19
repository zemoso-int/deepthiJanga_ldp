package javaassignment.PhoneProgram;

public class DriverClass {
    public static void main(String[] args){
        MusicPlayer music= new CellPhone();
        music.play();
        music.next();
        music.stop();
        Phone phone = new CellPhone();
        phone.phone("Nokia", "ABCD1234");
        System.out.println("CellPhone Name is " +phone.getName());
        System.out.println("CellPhone model is " +phone.getModelNumber());
    }
}
