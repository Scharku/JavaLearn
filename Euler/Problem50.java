package Euler;
//

public class Problem50 {

    static void Prime() {
        int n = 100;
        int counter = 0;
        
        PRIME:
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                counter = i + counter;
                //System.out.println("—четчик = " + counter);
            }
            COUNTER:
            for (int h = 2; h <= counter && counter < n; h++) {
                if (counter == 0) {
                    continue PRIME;
                } else {
                    System.out.println("—четчик = " + counter);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Prime();
    }
}