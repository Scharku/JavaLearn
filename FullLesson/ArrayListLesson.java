package FullLesson;

import java.util.*;

public class ArrayListLesson {

    /* List - список, содержит в себе неупорядоченные элементы
    с правильной индексацией.
    
    ArrayList - массив, который можно удалять, добавлять и менять длину
    ArrayList имеет тип object.
    
    Пример создания листа
    ArrayList <String> list = new ArrayList <> ();
     */
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student S = new Student();
        list.add(S);
        list.add(new StringBuilder("ok"));
        //System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("poka");
        //System.out.println(list2);

        /*
Методы ArrayList
         */
        ArrayList<Integer> Error = new ArrayList<>();

        Error.add(1); //добавить элемент в список
        Error.add(5); //добавить элемент в список
        Error.add(0, 2); //добавить элемент в индекс
        for (Integer I : Error) {
            //System.out.print(I + " ");
        }
        //System.out.println(" ");
        //System.out.println(Error.get(1)); //Вывести элемент
        Error.set(1, 3);
        for (Integer I : Error) {
            //System.out.print(I + " ");
        }

        ArrayList<StringBuilder> SB = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("privet");
        StringBuilder sb3 = new StringBuilder("poka");
        SB.add(sb1);
        SB.add(sb2);
        SB.add(sb3);
        for (int i = 0; i < SB.size(); i++) {
            SB.get(i).append("!!!"); //изменить объект
        }
        for (StringBuilder listen : SB) {
            //System.out.println(listen);
        }
        SB.remove(1); //Удаляет объект по индексу
        //System.out.println(SB);
        list.addAll(SB); //Добавляет список в список
        //System.out.println(list);

        SB.clear(); //очищает весь список
        SB.add(sb3);
        for (StringBuilder listen : SB) {
            //System.out.print(listen);
        }
    }

}

class Car {
};

class Student {
};

class Arra {

    public static void main(String[] args) {
        ArrayList<StringBuilder> SB2 = new ArrayList<>();
        SB2.add(new StringBuilder("poka"));
        SB2.add(new StringBuilder("privet"));
        SB2.add(new StringBuilder("ok"));
        SB2.add(new StringBuilder("hello"));
        for (StringBuilder s : SB2) {
            System.out.print(s + " ");
        }
        System.out.println(SB2.indexOf("poka"));
    }
}

class Arra2 {

    public static void main(String[] args) {
        ArrayList<String> SB2 = new ArrayList<>();
        SB2.add("poka");
        SB2.add("ok");
        SB2.add("privet");
        SB2.add("ok");
        SB2.add("hello");
        for (String s : SB2) {
            System.out.print(s + " ");
        }
        //выводит индекс первого совпадения
        System.out.println(SB2.indexOf("ok"));
        //выводит индекс последнего совпадения
        System.out.println(SB2.lastIndexOf("ok"));
        //выводит размер листа
        System.out.println(SB2.size());
        //пустой ли лист?
        System.out.println(SB2.isEmpty());
        //Содержит ли лист конкретный объект?
        System.out.println(SB2.contains("ok"));
        //Вывод данных без использования for-each
        System.out.println(SB2.toString());
        System.out.println(SB2);
    }
}

class Arra3 {

    public static void main(String[] args) {
        StringBuilder ssb1 = new StringBuilder("A");
        StringBuilder ssb2 = new StringBuilder("B");
        StringBuilder ssb3 = new StringBuilder("C");
        ArrayList<StringBuilder> lisst = new ArrayList<>();
        lisst.add(ssb1);
        lisst.add(ssb2);
        lisst.add(ssb3);
        ArrayList<StringBuilder> lisst2 = (ArrayList<StringBuilder>) lisst.clone();
        lisst.get(0).append("!!!");
        lisst.set(0, new StringBuilder("D"));
        //System.out.println(lisst2.get(0));
    }
}

class Arra4 {

    public static void main(String[] args) {
        StringBuilder ssb1 = new StringBuilder("A");
        StringBuilder ssb2 = new StringBuilder("B");
        StringBuilder ssb3 = new StringBuilder("C");
        ArrayList<StringBuilder> lisst3 = new ArrayList<>();
        lisst3.add(ssb1);
        lisst3.add(ssb2);
        lisst3.add(ssb3);
        //Object [] array1 = lisst3.toArray(); //Перевод в массов
        StringBuilder[] array2 = lisst3.toArray(new StringBuilder[6]);
        for (Object o : array2) {
            System.out.println(o);
        }
        StringBuilder[] array = {ssb1, ssb2, ssb2, ssb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
    }
}

class Arra5 {

    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> ar = new ArrayList<>();
        ar.add(s4);
        ar.add(s3);
        ar.add(s1);
        ar.add(s2);
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);
    }
}

class Arra6 {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 5};

        char[] array3 = {'p', 'r', 'i', 'v', 'e', 't'};
        char[] array4 = {'p', 'r', 'i', 'v', 'i', 'v', 'k', 'a'};

        System.out.println(Arrays.compare(array2, array1));
        //выводит индекс первого расхождения
        System.out.println(Arrays.mismatch(array2, array1));
    }
}

class Arra7 {
    public static void main(String[] args) {
        ArrayList <String> all = new ArrayList <>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
        System.out.println("all = " + all);
        ArrayList <String> al2 = new ArrayList <>();
        al2.add("one");
        al2.add("three");
        al2.add("four");
        all.retainAll(al2);
        System.out.println(all);
        //removeAll - удаляет все элеменеты из коллекции 1, которые есть в 2 коллекции.
        //retainAll - оставляет все элементы в коллекции 1, которые есть в коллекции 2.
        //содержание 1 и 2 коллекции
        boolean result = all.containsAll(al2);
        System.out.println(result);
        
        List <String> sublist = all.subList(1, 3);
        System.out.println(sublist);
    }
}