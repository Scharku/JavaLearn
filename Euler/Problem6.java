package Euler;
//Разница между квадрата суммы чисел и суммы квадратов чисел.
public class Problem6 {
    static void SquareDifference (){
        int counter;
        int k = 100;
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= k; i++){
            counter = i * i;
            sum = sum + counter;
        }
        for (int i = 1; i <= k; i++){
            counter = i;
            sum2 = sum2 + counter;
        }
        int Diff = sum2 * sum2 - sum;
        System.out.println(Diff);
    }
    
    public static void main(String[] args) {
        SquareDifference();
    }
}
