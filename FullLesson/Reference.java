
package FullLesson;
public class Reference {
    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee e = new Employee();
        
        Employee e2 = new Doctor(); //������ - ��� ��������, ��������� �� ��������
        Employee e3 = new Xirurg(); 
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int exp;
    
    void eat(){
        System.out.println("���");
    }
    
    void sleep(){
        System.out.println("����");
    }
}

class Doctor extends Employee {
    void heal() {
        System.out.println("�����");
    }
}

class Xirurg extends Doctor {
    int skalpel;
}

class Teacher extends Employee {
    void learn() {
        System.out.println("����");
    }
}