package Lesson8;
public class Homework8 {
    static int Multiplication(int a, int b, int c){
        return a*b*c;
    }
    
    static void Division(int a, int b, int c){
        System.out.println("Целое частное = " + a/b + ". Остаток от деление = " + a%b);
    }
}

class Test{
    public static void main(String[] args) {
        int k = Homework8.Multiplication(1, 2, 3);
        System.out.println(k);
        System.out.println(Homework8.Multiplication(1679, 26, 34));
        Homework8.Division(11,2,5);
        Homework8.Division(115638,26,53);    
    }
}
