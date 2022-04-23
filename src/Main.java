public class Main {
    public static void main(String[] args) {
        int balance = 200;
        int income = 1000;
        int bonus;
        if (income >= 1000) {
            bonus = income / 100;
            balance = balance + income + bonus;
        } else {
            balance = balance + income;
            bonus = 0;
        }
        System.out.println("Баланс: " + balance);
        System.out.println("Бонусов получено :" + bonus);
    }
}