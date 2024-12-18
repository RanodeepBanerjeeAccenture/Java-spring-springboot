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

    public static void main(String args[]){
        Car car = new Car("red", 10, 100);
        car.display();

    }
}
