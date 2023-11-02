package Euler; 
//Выполнение программы - 0 секунд. Оптимизация выполнения задачи.
public class Problem7_2 {

    static void Prime(int x) {
        int n = 900000000;
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
            
            if (k == x+1){
                break;
            }
        }
System.out.println(counter[x]);
    }

    public static void main(String[] args) {
        Prime(6);
        Prime(7);
        Prime(8);
        Prime(9);
    }
}
