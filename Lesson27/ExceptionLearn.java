package Lesson27;

public class ExceptionLearn {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("мясо");
        try {
            t.drink("вода");
            try {
                t.drink("пиво");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Это внутренний блок");
            }
        } catch (NotWaterException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Это внешний блок");
        }
    }
}

class NotMeetException extends RuntimeException {

    NotMeetException(String message) {
        super(message);
    }
}

class NotWaterException extends Exception {

    NotWaterException(String message) {
        super(message);
    }
}

class Tiger {

    public void eat(String food) {
        if (!food.equals("мясо")) {
            throw new NotMeetException("Тигр не ест " + food);
        }
        System.out.println("Тигр ест " + food);

    }

    public void drink(String water) throws NotWaterException{
        if (!water.equals("вода")) {
            throw new NotWaterException("Тигр не пьет " + water);
        }
        System.out.println("Тигр пьет воду");

    }

}
