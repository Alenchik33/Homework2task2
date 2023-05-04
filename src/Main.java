import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int account = 200;
        int pay = 1_300;

        int bonus;
        if (pay > 1_000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int balance = account + pay;
        System.out.println("Итоговый счет:" + balance + "руб.");
        System.out.println("Количество бонусных рублей:" + bonus + "руб.");
    }
}