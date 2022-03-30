public class Main {
    public static void main(String[] args) {
//        Входные данные
        int balance = 100;
        int refill = 900;
        int part = 100;
//        Логика программы
        int bonus;
        if (refill > 1000) {
            bonus = refill / part;
        } else {
            bonus = 0;
        }
        int total = balance + refill + bonus;
        System.out.println(total);
        System.out.println(bonus);
    }
}
