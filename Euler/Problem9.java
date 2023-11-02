package Euler;
//Поиск трех чисел Пифагора, суммирование чисел так, чтобы в сумме было 1000
public class Problem9 {

    static void PythagoreanTriplet(double k) {
        double c, x, m;
        OUTER:
        for (double a = 1; a < 100000; a++) {
            for (double b = 1; b < 100000; b++) {
                if (a < b) {
                    x = a * a + b * b;
                    c = Math.sqrt(x);
                    if (a < b && b < c && a + b + c == k) {
                        System.out.println("a =" + a + ", b =" + b + ", c =" + c);
                        m = a * b * c;
                        int l = (int) m;
                        System.out.println(l);
                        break OUTER;
                    }
                }
            }

        }
    }

    public static void main(String[] args) {
        PythagoreanTriplet(1000);
    }
}
