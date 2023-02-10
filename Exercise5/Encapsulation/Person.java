package Encapsulation;

public class Person {

    private String name;
    private int creditcard;

    public String getName() {

        return this.name;
    }

    public void setName(String newName) {

        this.name = newName;
    }
    
    public int getCC() {

        return this.creditcard;
    }

    public void setCC(int CardNum) {

        this.creditcard = CardNum;
    }
    
    
}
