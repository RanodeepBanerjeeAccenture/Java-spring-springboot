public class Vehicle {
    String color;
    int wheels;
    int mileage;

    void display(){
        System.out.println("Color: " + color);
        System.out.println("Wheels: " + wheels);
        System.out.println("Mileage: " + mileage);
    }
}

class Car extends Vehicle{
    public Car(String color, int wheels, int mileage){
        this.color = color;
        this.wheels = wheels;
        this.mileage = mileage;
    }

    @Override
    void display() {
        System.out.println("Car Details");
        super.display();
    }
}

class Bike extends Vehicle{
    public Bike(String color, int wheels, int mileage){
        this.color = color;
        this.wheels = wheels;
        this.mileage = mileage;
    }

    @Override
    void display() {
        System.out.println("Bike Details");
        super.display();
    }
}

class Main{
    public static void main(String[] args) {
        Car car = new Car("red", 4, 70);
        Bike bike = new Bike("green", 12, 100);
        car.display();
        bike.display();
    }
}
