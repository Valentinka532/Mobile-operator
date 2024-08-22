public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // Начальная сумма на счету клиента
        int topUpAmount = 1100; // Сумма пополнения

        int bonus = 0;
        if (topUpAmount > 1000) {
            bonus = (topUpAmount) / 100;
        }

        int newBalance = currentBalance + topUpAmount + bonus;

        System.out.println("Текущий баланс: " + currentBalance);
        System.out.println("Сумма пополнения: " + topUpAmount);
        System.out.println("Бонус: " + bonus);
        System.out.println("Новый баланс: " + newBalance);
    }
}