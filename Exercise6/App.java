package Polymorphism;

public class App {
    public static void main (String[] args) throws Exception{

    GroceryItem item1 = new GroceryItem();
    item1.name = "Tissue";
    item1.price = 50;
    item1.showItemName();
    

    GroceryItem item2 = new Toothbrush();
    item2.name = "OralB";
    item2.price = 118;
    item2.showItemName();
    

    System.out.println();

    GroceryItem item3 = new Toothpaste();
    item3.name = "Colgate";
    item3.price = 100;
    item3.showItemName();
    

    System.out.println();

    Cashier c1 = new Cashier();
    c1.checkOut(item2);
    c1.checkOut(item3);

    c1.showItemPrice(item2);
    c1.showItemPrice(item3);
}
}
