package Lesson24;

public class Interface {

}

class Employee {

    double salary = 100;
    String name;
    int age;
    int exp;

    void eat() {
        System.out.println("���");
    }

    void sleep() {
        System.out.println("����");
    }
}

class Teacher extends Employee implements Help_able {

    int kolichestvouchenikov;

    void learn() {
        System.out.println("����");
    }

    @Override
    public void pomosh() {
        System.out.println("������� ��������� ������");
    }

    @Override
    public void tushitpozar() {
        System.out.println("������� ����� �����");
    }
}

class Driver extends Employee implements Help_able, Swim_able {

    String NameCar;

    void vodit() {
        System.out.println("�����");
    }

    @Override
    public void pomosh() {
        System.out.println("�������� ��������� ������");
    }

    @Override
    public void tushitpozar() {
        System.out.println("�������� ����� �����");
    }

    @Override
    public void swim() {
        System.out.println("�������� �������");
    }

}

interface Help_able {

    void pomosh();

    void tushitpozar();
}

interface Swim_able { 

    void swim();
}
