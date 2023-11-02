package Lesson7;

public class Employey2 {
    int id = 1; 
    public String surname = "Блинов"; 
    int age = 14; 
    private float salary = 3000;
    
    Employey2(int id2, int age2){
        id = id2; age = age2;
        System.out.println("Данному сотруднику " + age + "лет.");
    }
    
    public Employey2(String surname2){
        surname = surname2;
        System.out.println("Фамилия данного сотрудника - " + surname);
    }
    
    private Employey2(float salary2){
        salary = salary2;
        System.out.println("Зарплата сотрудника составляет" + salary);
    }
    
    public void getId(){
        System.out.println(id);
    }
    
    public void getSalary(){
        System.out.println(salary);
    }
    
    public void GetSurname(){
        System.out.println(surname);
    }
}
    
class EmpTest {
    public static void main(String[] args) {
        Employey2 E1 = new Employey2(178, 65);
        Employey2 E2 = new Employey2("Сидоров");
        // Employey2 E3 = new Employey2(78234.235f);
        
        E1.getId();
        E1.getSalary();
        E1.GetSurname();
        
        E2.getId();
        E2.getSalary();
        E2.GetSurname();
        
    }
    
}