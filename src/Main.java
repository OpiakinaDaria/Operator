public class Main {
    public static void main(String[] args) {
        int balance;
        balance = 250;
        int donation1;
        donation1 = 500;
        int donation2;
        donation2 = 1500;
        int bonus1;
        bonus1 = donation1 / 100;
        int bonus2;
        bonus2 = donation2 / 100;
        if (donation1 < 1000) {
            System.out.println(donation1 + balance);
        } else {
            System.out.println(donation1 + balance + bonus1);
        }
        if (donation2 < 1000) {
            System.out.println(donation2 + balance);
        } else {
            System.out.println(donation2 + balance + bonus2);
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}