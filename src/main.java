import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год в формате yyyy");
        int year = scanner.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            System.out.println("Количество дней 366");
        }
        else System.out.println("Количество дней 365");
    }
}