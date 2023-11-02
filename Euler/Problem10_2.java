package Euler;
// (total time: 8 minutes 59 seconds)
// (total time: 4 minutes 52 seconds)

public class Problem10_2 {

    static void Prime() {
        int n = 100;
        long counter = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } 
            }
            if (isPrime) {
                counter = i;
                System.out.println(counter);
            }
        }
        
    }

    public static void main(String[] args) {
        Prime();
    }
}
