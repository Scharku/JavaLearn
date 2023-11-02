package Lesson6;

public class Student {
    public int id;
    public String name; 
    public String surname; 
    public int course; 
    public float average_math_score; 
    public float average_eco_score; 
    public float average_foreign_score;
    
    //Создание конструкторов типа Студент.
    public Student(int id1, String name1, String surname1, int course1, float average_math_score1, float average_eco_score1, float average_foreign_score1){
        id = id1;
        name = name1; 
        surname = surname1; 
        course = course1; 
        average_math_score = average_math_score1; 
        average_eco_score = average_eco_score1; 
        average_foreign_score = average_foreign_score1;
    }
    
    public Student(int id2, String name2, String surname2, int course2){
        this(id2, name2, surname2, course2, 0f, 0f, 0f );
    }
    
    public Student(){
        this(0, null, null, 0, 0f, 0f, 0f );
    }
    Student s1 = new Student(1, "Леонид", "Вендланд", 1,4.658f, 4.457f,4.745f);
    Student s2 = new Student(2, "Петр", "Александров", 2,4.125f, 3.936f,4.346f);
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(1, "Леонид", "Вендланд", 1,4.658f, 4.457f,4.745f);
        Student s3 = new Student(2, "Иван", "Васечкин", 3);
        System.out.println(s1.name);
        System.out.println(s2.average_math_score);
        System.out.println(s3.course);
        
    }
}
