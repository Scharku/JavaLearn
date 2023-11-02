package Lesson5;

class BankAccount {
    int id = 1;
    String name = "Леонид";
    float balance = 200;
    //Метод, увеличивающий баланс кошелька на 1.
    float popolnenieScheta(float summaup) {
        balance += summaup;
        return balance;
    }
    //Метод, уменьшаюший баланс кошелька на 1.
    float SnyatieScheta(float summadown) {
        balance -= summadown;
        return balance;
    }
}

class BankAccountTest {
    public static void main(String[] args) {
        BankAccount BA1 = new BankAccount();
        System.out.println("Баланс изначальный:" + BA1.balance);
        BA1.SnyatieScheta(100);
        System.out.println("Баланс после снятия:" + BA1.balance);
        BA1.popolnenieScheta(30);
        System.out.println("Баланс после пополнения:" + BA1.balance);
    }

}
