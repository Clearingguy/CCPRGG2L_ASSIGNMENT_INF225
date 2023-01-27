public class Car {
    String car;
    Myself owner;
    

    Car(String carName, Myself carOwner){
        this.car=carName;
        this.owner=carOwner;
    }
    void showCar(){
        System.out.println("Model: "+this.car+  "\nOwner: "+owner.name);
    }
}
