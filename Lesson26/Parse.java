package Lesson26;

public class Parse {

    void ab(int... a) {
        System.out.println(a.length);
    }

    ;

    //Блок инициализации
     static {System.out.println("Инициализация");}

    public static void main(String[] args) {
        String s1 = "60";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);

        Parse p1 = new Parse();
        Parse p2 = new Parse();
        p1.ab(1, 2, 3, 4, 5, 6, 7, 8, 7);
        
        //transient native synchronyzed volatile strictfp
    }
}
