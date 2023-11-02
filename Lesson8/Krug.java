package Lesson8;

public class Krug {
    public static final double pi = 3.14;
    
    public double Square(double r){
        double Sq = pi * r * r;
        return Sq;
    }
    
    public static double Line(double r){
        double Line = 2 * pi * r;
        return Line;
    }

    public void ShowInfo(double r){
        System.out.println("Радиус круга = " + r + ".");
        System.out.println("Площадь круга = " + Square(r) + ".");
        System.out.println("Длина окружности = " + Line(r) + ".");
    }
    
    public static void main(String[] args) {
        Krug krug = new Krug();
        krug.ShowInfo(50.3);
        krug.Square(2);
        Line(45);
        
    }
}
