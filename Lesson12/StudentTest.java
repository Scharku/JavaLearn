package Lesson12;

import Lesson11.Student;

public class StudentTest {

    public static void Comparison(Student s1, Student s2) {
        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("�������� �����.");
        } else {
            System.out.println("�������� �� �����.");
        }
    }

    public static void Comp(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            System.out.println("�������� �� ����� �  ����� ������ �����");
        } else if (s1.course != s2.course) {
            System.out.println("�������� �� ����� �  ����� ������ ����");
        } else if (s1.grade != s2.grade) {
            System.out.println("�������� �� ����� �  ����� ������ ������");
        } else {
            System.out.println("�������� �����.");
        }
    }

    public static void NestedComp(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course != s2.course) {
                if (s1.grade != s2.grade) {
                    System.out.println("�������� ����������");
                } else {
                    System.out.println("������ ��������� ��������.");
                }
            } else {
                System.out.println("����� ��������� ��������.");
            }
        } else {
            System.out.println("����� ��������� ��������.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("����", 3, 9.5);
        Student s2 = new Student("������", 4, 5.5);
        Student s3 = new Student("������", 4, 5.5);
        Student s4 = new Student("������", 3, 7.5);
        Student s5 = new Student("������", 3, 5.5);
        System.out.println("�������� ������� ������.");
        Comparison(s1, s2);
        Comparison(s2, s3);
        System.out.println("");
        System.out.println("�������� ������� ������.");
        Comp(s1, s2);
        Comp(s2, s3);
        Comp(s2, s4);
        Comp(s4, s5);

        System.out.println("");
        System.out.println("�������� �������� ������.");
        NestedComp(s1, s2);
        NestedComp(s2, s3);
        NestedComp(s2, s4);
        NestedComp(s4, s5);
    }
}
