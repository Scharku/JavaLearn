package Lesson24;

public class Problem1 {

    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("���");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        Pinguin p = new Pinguin("���������");
        System.out.println(p.name);
        p.eat();
        p.fly();
        p.sleep();
        p.speak();
        Lev l = new Lev("�����");
        System.out.println(l.name);
        l.eat();
        l.sleep();
        l.speak();
        l.run();
        Mammal leo = new Lev("�����");
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
        System.out.println("������ ��������� ���������, ��� ���� ����");
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
        System.out.println(name + " ����");
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
        System.out.println("��������� �������� ����, ������� ������ �������");
    }

    @Override
    public void eat() {
        System.out.println("��������� �� ������ � ��� ��� ������� ����");
    }
}

class Pinguin extends Bird {

    Pinguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("������� ����� ���� ����");
    }

    @Override
    public void sleep() {
        System.out.println("�������� ���� ���������� ���� � �����");
    }

    @Override
    public void fly() {
        System.out.println("�������� �� ����� ������");
    }

    @Override
    public void speak() {
        System.out.println("�������� �� ����� ����, ��� �������");
    }
}

class Lev extends Mammal {

    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("���, ��� � ����� ������, ����� ����.");
    }

    @Override
    public void sleep() {
        System.out.println("������� ����� ��� ��� ����");
    }

    @Override
    public void run() {
        System.out.println("��� ��� �� ����� ������� �����");
    }
}