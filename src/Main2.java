import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;

        while (true) {
            System.out.println("Введите год: ");
            int year = scanner.nextInt();

            System.out.println("Введите количество дней: ");
            int userDays = scanner.nextInt();

            int correctDays = isLeapYear(year) ? 366 : 365;

            if (userDays == correctDays) {
                score++;
            } else {
                System.out.println("Неправильно! В этом году " + correctDays + " дней!");
                break;
            }
        }

        System.out.println("Набрано очков: " + score);
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) ||
                (year % 4 == 0 && year % 100 != 0);
    }
}