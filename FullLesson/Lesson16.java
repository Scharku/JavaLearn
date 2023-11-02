package FullLesson;

public class Lesson16 {

    /* 
    16 урок - String
    
     */
    public static void main(String[] args) {
        String s1 = new String("abcdefgabc");

        int a = s1.length(); //Выводит длину string
        System.out.println(a);

        //Выводит инфу, что находится на этом индексе.
        char c1 = s1.charAt(3);
        System.out.println(c1);

        //Выводит инфу, на каком индексе находится нужный char.
        int i1 = s1.indexOf('f');
        System.out.println(i1);

        //Выведет первый индес, где начинается.
        int i2 = s1.indexOf("bcd");
        System.out.println(i2);

        //если такого символа нет, то выведет -1.
        int i3 = s1.indexOf('Z');
        System.out.println(i3);

        //начиная с индекса X (4)
        int i4 = s1.indexOf('a', 4);
        System.out.println(i4);

        //String начинается с ()... если да, то true.
        boolean b1 = s1.startsWith("abc");
        System.out.println(b1);

        //String заканчивается на ()... если да, то true.
        boolean b2 = s1.endsWith("abc");
        System.out.println(b2);

        //Присвой новому стрингу кусок строки из первого стринга.
        String s2 = s1.substring(3);
        System.out.println(s2);

        String s3 = s1.substring(3, 7);
        System.out.println(s3);

        //убирает пробелы по бокам. strip работает также. stripLeading слева.
        //stripTrailing удаляет пробелы справа.
        String s4 = s1.trim();
        System.out.println(s4);

        //Заменяет одно на другое. Можно менять чары или стринг.
        String s5 = s1.replace('a', 'k');
        System.out.println(s5);

        //Тоже самое, что +
        String s6 = "privet, ";
        String s7 = "drug";
        System.out.println(s6.concat(s7));

        //Делает буквы маленькими, toUpperCase - большими.
        String s8 = "HRSHSRDHSDRJNH";
        System.out.println(s8.toLowerCase());
        
        //Содержит ли в себе значение?
        boolean b3 = s1.contains("f");
        System.out.println(b3);
        
        //Состоит ли стринг из пробелов и табов?
        String s9 = "   ";
        System.out.println(s1.isBlank());
        System.out.println(s9.isBlank());
        
        //Пустой ли стринг?
        String s10 = "";
        System.out.println(s10.isEmpty());
    }
}
