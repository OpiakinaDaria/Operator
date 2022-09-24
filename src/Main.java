public class Main {
    public static void main(String[] args) {
        int balance;
        balance = 250;
        int donation1;
        donation1 = 500;

        int bonus1;
        bonus1 = donation1 / 100;

        if (donation1 < 1000) {
            System.out.println(donation1 + balance);
        } else {
            System.out.println(donation1 + balance + bonus1);
        }

    }
    // Объявляете переменные для входных данных и
    // параметров программы: начального счёта,
    // суммы пополнения и тп

    // Условным оператором проверяете превысила ли
    // сумма пополнения порог и для этих двух разных
    // сценариев рассчитываете сумму бонуса и выводите
    // на экран.
}
