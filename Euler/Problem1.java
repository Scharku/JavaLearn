package Euler;
//����� ���� ������� ����� 3 ��� 5 � ���������� �� 1 �� 1000 � ����������
// ������������ �����.
public class Problem1 { 
    public static void Natural() {
        int counter = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                counter += i;
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        Natural();
    }
}

//������ �����, ��� �� 10 �����.