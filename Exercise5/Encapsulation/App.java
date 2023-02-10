package Encapsulation;

public class App {
    public static void main(String[] args) throws Exception {

        Person Me = new Person();

        // The name property cannot be accessed outside of the Person class.
        // Me.name;

        Me.setName("Gabion");

        String myName = Me.getName();

        System.out.println("My name is " + myName);

         Me.setCC(2316);

        int myCC = Me.getCC();

        System.out.println("My credit card number is " + myCC);
    }
}
