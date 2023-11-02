package Lesson15;
//Выводит на экран число, кратное деленое на два других, в примере 5 и 7.
public class While {

    public static void main(String[] args) {
        boolean b = true;

        int a = 1;

        while (b) {
            if (a % 5 == 0 && a % 7 == 0) {
                System.out.println(a);

                break;
            }
            a++;
        }
    }

}
