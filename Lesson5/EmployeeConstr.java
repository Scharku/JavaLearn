package Lesson5;

class EmployeeConstr {
    int id; 
    String surname; 
    int age; 
    float salary; 
    int department;
    
    EmployeeConstr(int id2, String surname2, int age2 ,float salary2, int department2){
        id = id2; 
        surname = surname2; 
        age = age2; 
        salary = salary2; 
        department = department2;
          
    }
    
    //Метод, увеличивающий зарплату вдвое.
    float salaryx2 (EmployeeConstr e){
        salary = e.salary * 2;
        return salary;
    }
}

class EmpTest {
    public static void main(String[] args) {
        EmployeeConstr E1 = new EmployeeConstr(1, "Блинов", 43, 500, 2);
        EmployeeConstr E2 = new EmployeeConstr(2, "Мамедов", 46, 346, 1);
        E1.salaryx2(E1);
        E2.salaryx2(E2);
        System.out.println("Зарплата после увеличения у " + E1.surname + " составляет " + E1.salary);
        
    }
    
}