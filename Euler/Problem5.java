package Euler;

public class Problem5 { //232792560

    static void Smallest() {
        for (int i = 1; i < 900000000; i++) {
            if (i % 5 == 0 && i % 7 == 0 && i % 9 == 0
                    && i % 11 == 0 && i % 13 == 0 && i % 16 == 0
                    && i % 17 == 0 && i % 19 == 0) {
                System.out.println(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Smallest();
    }
}
