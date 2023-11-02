package FullLesson;

public class Binding {

    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Binding d = new Binding();
        Animal an = new Mouse();
        d.abc(an);
    }
}

class Animal {

    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal{

    void getName() {
        System.out.println("Mouse");
    }
}
