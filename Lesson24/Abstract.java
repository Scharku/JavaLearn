package Lesson24;

public class Abstract {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvostoron);
        f1.perimetr();
    }
}

abstract class Figura {

    int kolichestvostoron = 0;

    abstract void perimetr();

    abstract void ploshad();

    void ShowInfo() {
        System.out.println("Это фигура");
    }
}

class Kvadrat extends Figura {

    int kolichestvostoron = 4;
    int storona = 10;

    public void perimetr() {
        System.out.println("Периметр квадрата = " + 4 * storona);
    }

    public void ploshad() {
        System.out.println("Площадь квадрата = " + storona * storona);
    }
}

class Ptyamougolnik extends Figura {

    int kolichestvostoron = 4;
    int storona = 8;
    int storona2 = 5;

    public void perimetr() {
        System.out.println("Периметр прямоугольника = " + (storona2 + storona) * 2);
    }

    public void ploshad() {
        System.out.println("Площадь прямоугольника = " + storona2 * storona);
    }
}

class Krug extends Figura {

    int kolichestvostoron = 0;
    int radius = 3;

    public void perimetr() {
        System.out.println("Периметр круга = " + radius * 2 * 3.14);
    }

    public void ploshad() {
        System.out.println("Площадь круга = " + 3.14 * radius * radius);
    }
}

abstract class chetyrexugolnik extends Figura {

    void def() {
        System.out.println("Это четырехугольник");
    }
}
