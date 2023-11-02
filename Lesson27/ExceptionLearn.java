package Lesson27;

public class ExceptionLearn {

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat("����");
        try {
            t.drink("����");
            try {
                t.drink("����");
            } catch (NotWaterException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("��� ���������� ����");
            }
        } catch (NotWaterException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("��� ������� ����");
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
        if (!food.equals("����")) {
            throw new NotMeetException("���� �� ��� " + food);
        }
        System.out.println("���� ��� " + food);

    }

    public void drink(String water) throws NotWaterException{
        if (!water.equals("����")) {
            throw new NotWaterException("���� �� ���� " + water);
        }
        System.out.println("���� ���� ����");

    }

}
