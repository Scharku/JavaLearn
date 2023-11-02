package Lesson24;

public class Interface {

}

class Employee {

    double salary = 100;
    String name;
    int age;
    int exp;

    void eat() {
        System.out.println("Ест");
    }

    void sleep() {
        System.out.println("Спит");
    }
}

class Teacher extends Employee implements Help_able {

    int kolichestvouchenikov;

    void learn() {
        System.out.println("Учит");
    }

    @Override
    public void pomosh() {
        System.out.println("Учитель оказывает помощь");
    }

    @Override
    public void tushitpozar() {
        System.out.println("Учитель тушит пожар");
    }
}

class Driver extends Employee implements Help_able, Swim_able {

    String NameCar;

    void vodit() {
        System.out.println("Водит");
    }

    @Override
    public void pomosh() {
        System.out.println("Водитель оказывает помощь");
    }

    @Override
    public void tushitpozar() {
        System.out.println("Водитель тушит пожар");
    }

    @Override
    public void swim() {
        System.out.println("Водитель плавает");
    }

}

interface Help_able {

    void pomosh();

    void tushitpozar();
}

interface Swim_able { 

    void swim();
}
