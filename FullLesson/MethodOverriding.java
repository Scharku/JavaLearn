
package FullLesson;

public class MethodOverriding {
   //��������� non-static, non-final ������ � sub ������, �������������� �� ��������  
    public static void main(String[] args) {
        Doctor d = new Doctor();
        d.eat();
    }
}


class Employee {
    double salary = 100;
    String name;
    int age;
    int exp;
    
    void eat(){
        System.out.println("�������� ���");
    }
    
    void sleep(){
        System.out.println("����");
    }
}

class Doctor extends Employee {
    void heal() {
        System.out.println("�����");
    }
    
    void eat(){
        System.out.println("������ ���");
    }
}