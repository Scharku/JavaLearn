package Lesson25;

public class Problem {

    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Меченосец 1");
        Animal a2 = new Pinguin("Пингвин 1");
        Animal a3 = new Lev("Лев 1");
        Bird b1 = new Pinguin("Пингвин 2");
        Mammal m1 = new Lev("Лев 2");
        Fish f1 = new Mechenosec("Меченосец 2");
        Mechenosec mech1 = new Mechenosec("Меченосец 3");
        Pinguin p1 = new Pinguin("Пингвин 3");
        Lev l1 = new Lev("Лев 3");
        Animal[] mass_animal = {a1, a2, a3, b1, m1, f1, mech1, p1, l1};

        speekable s1 = new Pinguin("Пингвин_s");
        speekable s2 = new Lev("Lev_s");
        speekable[] speak_animal = {s1, s2, b1, m1, p1, l1};

        for (Animal a : mass_animal) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if (a instanceof Pinguin) {
                Pinguin p = (Pinguin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
            }
        }
        System.out.println("______________");
        for (speekable a : speak_animal) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.swim();
                m.sleep();
            } else if (a instanceof Pinguin) {
                Pinguin p = (Pinguin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
            }
        }
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
