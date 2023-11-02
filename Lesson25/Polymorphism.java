package Lesson25;

public class Polymorphism {

    public static void main(String[] args) {
        Employee e1 = new Doctor();
        Employee e2 = new Teacher();
        Doctor d1 = (Doctor)e1; //casting
        System.out.println(d1.spec);
        ((Doctor)e1).heal();
    }
}

//instanceof - �������� �� ������ ��������?
//emp1 instanceof Teacher - true of false.
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

class Doctor extends Employee {

    String spec = "xirurg";

    void heal() {
        System.out.println("�����");
    }
}

class Xirurg extends Doctor {

    int skalpel;
}

class Teacher extends Employee {
String spec = "����������";
    void learn() {
        System.out.println("����");
    }
}
