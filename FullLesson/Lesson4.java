package FullLesson;

class Lesson4 {
    /* Ќа 4 уроке изучено пон€тие класса.
        Class - это шаблон, образец, чертеж.
        Object - это производна€ данного класса, который существует в моменте.
    
        “акже изучено пон€тие reference data types. »х может быть неограниченное
        число данных, в зависимости от того, сколько создано классов.
    */
}

class Student {
    //Instance variable. “е, переменные, которые относ€тс€ к классу.
    // аждый объект имеет эти переменные. 
    int course;
    String name;
}
    
class Test {
    public static void main(String[] args) {
        //—оздание объекта проходит по такому шаблону
        Student S1 = new Student();
        
        //Student() - конструктор, мы можем создавать нужные нам конструкторы
        S1.course = 4; //„тобы обратитьс€ к IV пишем подобным образом.
        System.out.println(S1.course);
    }
}

