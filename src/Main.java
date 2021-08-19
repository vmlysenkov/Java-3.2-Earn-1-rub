public class Main {
    public static void main(String[] args) {
        int account = 500;
        int refill = 1_000;
        int bonus;
        if (refill > 1_000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int total = account + refill + bonus;
        System.out.println(total);
        System.out.println(bonus);
    }
}