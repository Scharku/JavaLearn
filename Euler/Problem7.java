package Euler; //Выполнение программы - 37 секунд. Ответ - 104743

public class Problem7 {

    static void Prime() {
        int n = 500000;
        int k = 1;
        int[] counter = new int[n];
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                k++;
                counter[k-1] = i;
            }
            
        }
System.out.println(counter[10001]);
    }

    public static void main(String[] args) {
        Prime();
    }
}
