package Lesson15;
//������� �� ����� �����, ������� ������� �� ��� ������, � ������� 5 � 7.
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
