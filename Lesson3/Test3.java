/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lesson3;

/**
 *
 * @author vendl
 */
public class Test3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2%i1 - l;  // 0,909 + 1.3 - 20 = - 17.791
        //System.out.println(result);
        
        int a = 5, b = 8;
        int ou1 = a-- - --a + ++a + a++ +a; //5-3+4+4+5 = 15
        int ou2 = ++b - b++ + ++b - --b; //9-9+11-10=1
        //System.out.println(ou1);
        //System.out.println(ou2);
        
        boolean b1 = false;
        boolean b2 = false;
        boolean b3 = true;
        
        System.out.println(b1 && (b2 || b3));
        
    }
}
