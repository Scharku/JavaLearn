package Euler;
// (total time: 8 minutes 59 seconds)
// (total time: 4 minutes 52 seconds)

public class Problem10 {

    static void Prime(int n) {
        long counter = 0L;
        for (int i = 3; i < n; i = i + 2) {
            boolean isPrime = true;
            for (int j = 3; j < i; j = j + 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                counter = counter + i;
            }
        }
        System.out.println(counter + 2);
    }

    public static void main(String[] args) {
        Prime(2000000);
    }
}
