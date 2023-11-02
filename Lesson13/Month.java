package Lesson13;

class Month {
    public static void Day(int day) {
        switch (day) {
            case 1:
                System.out.println("В январе 31 день");
                break;
            case 2:
                System.out.println("В феврале 28 дней");
                break;
            case 3:
                System.out.println("В марте 31 день");
                break;
            case 4:
                System.out.println("В апреле 30 дней");
                break;
            case 5:
                System.out.println("В мае 31 день");
                break;
            case 6:
                System.out.println("В июне 30 дней");
                break;
            case 7:
                System.out.println("В июле 31 день");
                break;
            case 8:
                System.out.println("В августе 31 день");
                break;
            case 9:
                System.out.println("В сентябре 30 дней");
                break;
            case 10:
                System.out.println("В октябре 31 день");
                break;
            case 11:
                System.out.println("В ноябре 30 дней");
                break;
            case 12:
                System.out.println("В декабре 31 день");
                break;
            default:
                System.out.println("Такого месяца нет");
        }
    }
    
    
    public static void main(String[] args) {
        Day(5);
    }
}


