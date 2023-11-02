package Lesson11;

public class Student {
    public String name;
    public int course;
    public double grade;
    
    public Student(String name, int course, double grade) {
        this.name = name;
        this.grade = grade;
        this.course = course;
    }
    
    public static void swap(Student s1, Student s2){
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
            System.out.println(s1.name);
    }
    
    public static void changeName(Student s1){
        s1.name = "Василий";
    }
    public static void main(String[] args) {
        Student s1 = new Student("Иван", 3, 9.5);
        Student s2 = new Student("Виктор", 4, 5.5);
    }
}
