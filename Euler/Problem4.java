package Euler;

public class Problem4 {

    static void Palindrome() {
        int n = 1000;
        int maxPalindrome = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int counter = i * j;
                String Test = String.valueOf(counter);
                String reversedTest = new StringBuilder(Test).reverse().toString();
                if (Test.equals(reversedTest) && maxPalindrome < counter) {
                    maxPalindrome = counter;
                }
            }
        }
        System.out.println(maxPalindrome);
    }

    public static void main(String[] args) {
        Palindrome();
    }
}
