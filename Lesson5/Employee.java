package Lesson5;
class Employee {
    int id; 
    String surname; 
    int age; 
    float salary; 
    int department;
    //�����, ������������� �������� �����.
    float salaryx2 (Employee e){
        salary = e.salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        //������� ��� ������.
        Employee E1 = new Employee();
        Employee E2 = new Employee();
        //����������� �������� ���������.
        E1.id = 1; 
        E1.surname = "�������"; 
        E1.age = 23; 
        E1.salary = 200; 
        E1.department = 1;
        E2.id = 2; 
        E2.surname = "������"; 
        E2.age = 27; 
        E2.salary = 300; 
        E2.department = 2;    
        System.out.println("�������� �� ���������� � " + E1.surname + " ���������� " + E1.salary);
        E1.salaryx2(E1);
        System.out.println("�������� ����� ���������� � " + E1.surname + " ���������� " + E1.salary);
        System.out.println("�������� �� ���������� � " + E2.surname + " ���������� " + E2.salary);
        E2.salaryx2(E2);
        System.out.println("�������� ����� ���������� � " + E2.surname + " ���������� " + E2.salary);
                
    }
}