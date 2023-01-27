public class App {
    public static void main(String[] args) throws Exception {
    
        Person friend = new Person("Tyn", 18);

        Myself me = new Myself("Gabion", 19 );

        me.addFriend(friend);

        Pet Rabbit = new Pet("Amiya", friend );

        Rabbit.showOwnerName();

        Car car = new Car("AE86", me);
        car.showCar();
    }
}
