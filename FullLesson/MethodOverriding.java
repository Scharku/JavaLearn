
package FullLesson;

public class MethodOverriding {
   //Изменение non-static, non-final метода в sub классе, унаследованный от родителя  
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
        System.out.println("Работник ест");
    }
    
    void sleep(){
        System.out.println("Спит");
    }
}

class Doctor extends Employee {
    void heal() {
        System.out.println("Лечит");
    }
    
    void eat(){
        System.out.println("Доктор ест");
    }
}