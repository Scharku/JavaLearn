package Lesson18;

import java.util.Arrays;

public class Lesson18 {
    static void sort(int [] array) {
    Arrays.sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
}
    
    public static void main(String[] args) {
        int [] array = {-1, 543, 45, 123, -3568};
        sort(array);
    }
}
