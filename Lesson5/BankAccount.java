package Lesson5;

class BankAccount {
    int id = 1;
    String name = "������";
    float balance = 200;
    //�����, ������������� ������ �������� �� 1.
    float popolnenieScheta(float summaup) {
        balance += summaup;
        return balance;
    }
    //�����, ����������� ������ �������� �� 1.
    float SnyatieScheta(float summadown) {
        balance -= summadown;
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount BA1 = new BankAccount();
        System.out.println("������ �����������:" + BA1.balance);
        BA1.SnyatieScheta(100);
        System.out.println("������ ����� ������:" + BA1.balance);
        BA1.popolnenieScheta(30);
        System.out.println("������ ����� ����������:" + BA1.balance);
    }

}
