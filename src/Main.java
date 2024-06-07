public class Main {
    public static void main(String[] args) {
        int account = 1_000; // сумма на счете клиента
        int refill = 1100; // сумма пополнения
        int bonus = refill / 100;
        if (refill < 1000) {
            bonus = 0;
        }


        System.out.println("Количество бонусных рублей:");
        System.out.println(bonus);
        System.out.println("Итоговый счет:");
        System.out.println(account + refill + bonus);
    }
}
