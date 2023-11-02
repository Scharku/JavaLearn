package Euler;

public class Problem2 {
//����� ������ ����� ��������� �� 4 ���������.
    public static void Fibonacci() {
        int n = 200;
        int[] counter = new int[n];
        counter[0] = 0;
        counter[1] = 1;
        int summ = 0;
        for (int i = 2; i < n; i++) {
            counter[i] = counter[i - 1] + counter[i - 2];
            if (counter[i] < 4e6 && counter[i] > 0 && counter[i] % 2 == 0){
                summ = summ + counter[i];
            }
        }
        System.out.println(summ);
    }
    public static void main(String[] args) {
        Fibonacci();
    }
}
//������� ������� 20 �����.