package Lesson22;

public class Student {

    private StringBuilder name;
    private int course;
    private int grade;

    public StringBuilder getName() {
        StringBuilder name2 = new StringBuilder(name);
        return (name2);
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCourse() {
        return (course);
    }

    public void setCourse(int i) {
        if (i > 0 && i <= 4) {
            course = i;
        }
    }

    public int getGrade() {
        return (grade);
    }

    public void setGrade(int i) {
        if (i > 0 && i <= 10) {
            grade = i;
        }
    }

    public void ShowInfo(){
        System.out.println("Имя - " + getName());
        System.out.println("Оценка - " + getGrade());
        System.out.println("Курс - " + getCourse());
    }
}

class StudentTest{
    public static void main(String[] args) {
        Student s = new Student();
        s.setName(new StringBuilder ("Ivan"));
        s.setCourse(4);
        s.setGrade(10);
        s.ShowInfo();
    }
}