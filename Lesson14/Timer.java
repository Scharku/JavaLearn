package Lesson14;

public class Timer {

    public static void Timer() {
        HOUR:
        for (int hour = 0; hour < 6; hour++) {
            MINUTE:
            for (int minute = 0; minute < 60; minute++) {
                SECOND:
                for (int second = 0; second < 60; second++) {
                    if (hour > 1 && minute % 10 == 0) {
                        break HOUR;
                    }
                    if (second * hour > minute) {
                        continue MINUTE; }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        Timer();
    }
}
