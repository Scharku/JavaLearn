package FullLesson;

class Lesson4 {
    /* �� 4 ����� ������� ������� ������.
        Class - ��� ������, �������, ������.
        Object - ��� ����������� ������� ������, ������� ���������� � �������.
    
        ����� ������� ������� reference data types. �� ����� ���� ��������������
        ����� ������, � ����������� �� ����, ������� ������� �������.
    */
}

class Student {
    //Instance variable. ��, ����������, ������� ��������� � ������.
    //������ ������ ����� ��� ����������. 
    int course;
    String name;
}
    
class Test {
    public static void main(String[] args) {
        //�������� ������� �������� �� ������ �������
        Student S1 = new Student();
        
        //Student() - �����������, �� ����� ��������� ������ ��� ������������
        S1.course = 4; //����� ���������� � IV ����� �������� �������.
        System.out.println(S1.course);
    }
}

