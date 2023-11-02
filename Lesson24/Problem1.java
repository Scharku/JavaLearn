package Lesson24;

public class Problem1 {

    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Джо");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        Pinguin p = new Pinguin("Ковальски");
        System.out.println(p.name);
        p.eat();
        p.fly();
        p.sleep();
        p.speak();
        Lev l = new Lev("Алекс");
        System.out.println(l.name);
        l.eat();
        l.sleep();
        l.speak();
        l.run();
        Mammal leo = new Lev("Симба");
        System.out.println(leo.name);
        leo.eat();
        leo.sleep();
        leo.speak();
        leo.run();
    }
}

abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {

    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements speekable {

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " поет");
    }
}

abstract class Mammal extends Animal implements speekable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface speekable {

    default void speak() {
        System.out.println("Somebody speaks");
    }

}

class Mechenosec extends Fish {

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }

    @Override
    public void eat() {
        System.out.println("Меченосец не хищник и она ест обычный корм");
    }
}

class Pinguin extends Bird {

    Pinguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

    @Override
    public void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    @Override
    public void speak() {
        System.out.println("Пингвины не умеют петь, как соловьи");
    }
}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Лев, как и любой хищник, любит мясо.");
    }

    @Override
    public void sleep() {
        System.out.println("Большую часть дня лев спит");
    }

    @Override
    public void run() {
        System.out.println("Лев это не самая быстрая кошка");
    }
}