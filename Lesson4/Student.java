package Lesson4;
public class Student {
        int id;
        String name;
        String surname;
        int year;
        float average_math_score;
        float average_eco_score;
        float average_foreign_score;
}

class StudentTest {
    public static void main(String[] args) {
        //������� ��� ��������
        Student Student1 = new Student(); 
        Student Student2 = new Student();
        Student Student3 = new Student();
        //��������� �������� ������� ��������
        Student1.id = 1;
        Student1.name = "������";
        Student1.surname = "��������";
        Student1.year = 2023;
        Student1.average_eco_score = 4.512f;
        Student1.average_math_score = 4.124f;
        Student1.average_foreign_score = 3.976f;
        float average1 = (Student1.average_eco_score + Student1.average_math_score + Student1.average_foreign_score) / 3;
        //��������� �������� ������� ��������
        Student2.id = 2;
        Student2.name = "�����";
        Student2.surname = "�����������";
        Student2.year = 2021;
        Student2.average_eco_score = 3.512f;
        Student2.average_math_score = 4.473f;
        Student2.average_foreign_score = 4.724f;
        float average2 = (Student2.average_eco_score + Student2.average_math_score + Student2.average_foreign_score) / 3;
        //��������� �������� �������� ��������
        Student3.id = 3;
        Student3.name = "����";
        Student3.surname = "�������";
        Student3.year = 2022;
        Student3.average_eco_score = 4.261f;
        Student3.average_math_score = 3.787f;
        Student3.average_foreign_score = 4.865f;
        float average3 = (Student3.average_eco_score + Student3.average_math_score + Student3.average_foreign_score) / 3;
        //������� ������� ������ �� ��� ��������.
        System.out.println("� �������� " + Student1.name + " " + Student1.surname + " " + "������� ������ �� ��������� " + average1);
        System.out.println("� �������� " + Student2.name + " " + Student2.surname + " " + "������� ������ �� ��������� " + average2);
        System.out.println("� �������� " + Student3.name + " " + Student3.surname + " " + "������� ������ �� ��������� " + average3);
    }
}