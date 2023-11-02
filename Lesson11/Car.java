package Lesson11;

public class Car {
    String color;
    String motor;
    int door;
    
    Car(String color, String motor, int door) {
        this.color = color;
        this.motor = motor;
        this.door = door;
    }
}

class CarTest {
    
    public static void DoorUp(Car c1, int door){
        c1.door = door;
    }
    
    public static void ColorSwap(Car c1, Car c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color  = color;
    }
    
    public static void main(String[] args) {
        Car car1 = new Car("Red", "V6", 4);
        Car car2 = new Car("Black", "V8", 2);
        System.out.println(car1.door);
        DoorUp(car1, 8);
        System.out.println(car1.door);
        System.out.println(car1.color + " " + car2.color);
        ColorSwap(car1, car2);
        System.out.println(car1.color + " " + car2.color);
    }
}