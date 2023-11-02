package Lesson15;

class Timer {

    public static void Timer() {
        HOUR: //OUTER - while
        for (int hour = 0; hour < 6; hour++) {
            MINUTE: // MIDDLE - do while
            for (int minute = 0; minute < 60; minute++) {
                SECOND: //INNER - while
                for (int second = 0; second < 60; second++) {
                    if (hour > 1 && minute % 10 == 0) {
                        break HOUR;
                    } else if (second * hour > minute) {
                        continue MINUTE;
                    } else {
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                }
            }
        }
    }
}

class TimerWhile2 {

    public static void TimerWhile() {
        int hour = 0;
        HOUR:
        while (hour < 6) {
            int minute = -1;
            MINUTE:
            do {
                minute++;
                int second = 0;
                if (hour > 1 && minute % 10 == 0) {
                    break HOUR;
                }
                SECOND:
                while (second < 60) {
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                    if (second * hour > minute) {
                        continue MINUTE;
                    }
                }
            } while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        TimerWhile();
    }
}
