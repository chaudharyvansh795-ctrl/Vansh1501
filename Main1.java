package package1;

class Car {
    int mileage;
    int price;
}

public class Main1 {
    public static void main(String[] args) {

        Car c = new Car();
        c.mileage = 10;
        c.price = 1000;

        System.out.println("Mileage: " + c.mileage);
        System.out.println("Price: " + c.price);
    }
}
