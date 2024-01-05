// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Циклы");

        System.out.println("Задание 1");


        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println(" Задание 2 ");

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println(" Задание 3 ");

        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println(" Задание 4 ");

        for (int i = 10; i >= -10; i -= 1) {
            System.out.println(i);
        }
        System.out.println(" Задание 5 ");

        for (int year = 1904; year <= 2096; year += 4) {
            System.out.println(year + " год является високосным");
        }
        System.out.println(" Задание 6 ");

        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i + " ");
        }
        System.out.println(" Задание 7 ");

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i + " ");
        }
        System.out.println(" Задание 8 ");

        int deferredAmount = 29000;

        for (int amount = 1; amount <= 12; amount++) {
            System.out.println(" Месяц " + amount + " сумма накоплений " + amount * deferredAmount + " рублей ");
        }
    }
}
