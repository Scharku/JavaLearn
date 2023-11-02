package Lesson26;

public class Equals {

    public static void main(String[] args) {
        Car c1 = new Car("red", "V6");
        Car c2 = new Car("red", "V6");
        Car c3 = new Car("black", "V8");
        System.out.println(c1.equals(c2));
        System.out.println(c1.toString());
    }
}

class Car {

    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car Car) {
            Car c = (Car) obj;
            return (color.equals(c.color) && engine.equals(c.engine));
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Машина цвета " + color + " и с мотором " + engine;
    }
}
