package FullLesson;

public class Foreach {

    public static void main(String[] args) {
        int[] array = {0, 5, 3, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}

/*

 */
