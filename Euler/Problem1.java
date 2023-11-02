package Euler;
//Поиск всех кратных чисел 3 или 5 в промежутке от 1 до 1000 и дальнейшее
// сумированние чисел.
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

//Решено менее, чем за 10 минут.