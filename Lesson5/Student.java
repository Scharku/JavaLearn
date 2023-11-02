package Lesson5;

class Student {
    String name; 
    String surname; 
    int year; 
    float average_math_score; 
    float average_eco_score; 
    float average_foreign_score;

}

class StudentTest {
            //Метод, который считает средний балл между тремя предметами.
    float SrOcenka(Student st){
            float average = (st.average_math_score + st.average_eco_score + st.average_foreign_score) / 3;
            System.out.println("У студента " + st.year + " года обучения "+ st.name + " " + st.surname + " " + "средняя оценка по предметам: " + average);
            return average;
            }
    public static void main(String[] args) {
        //Вызов метода и прописывание параметров студенту на вывод.
        Student ST1 = new Student();
        ST1.name = "Леонид";
        ST1.surname = "Вендланд";
        ST1.year = 3; 
        ST1.average_math_score = 4.63f; 
        ST1.average_eco_score = 4.24f; 
        ST1.average_foreign_score = 4.67f;
        
        StudentTest sTest = new StudentTest();
        sTest.SrOcenka(ST1);
    }
}
