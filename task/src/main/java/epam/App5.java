package epam;

import java.util.Scanner;

/*
 * 5.   Ввести число от 1 до 12.
 * Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */

public class App5 {
    public static void main(String[] args) {
        int monthNumber;
        System.out.println("Введите число от 1 до 12");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        if (isNumberEmpty(month)) {
            monthNumber = Integer.parseInt(month);
            switch (monthNumber) {
                case  1:
                    System.out.println("Январь");
                    break;
                case  2:
                    System.out.println("Февраль");
                    break;
                case  3:
                    System.out.println("Март");
                    break;
                case  4:
                    System.out.println("Апрель");
                    break;
                case  5:
                    System.out.println("Май");
                    break;
                case  6:
                    System.out.println("Июнь");
                    break;
                case  7:
                    System.out.println("Июль");
                    break;
                case  8:
                    System.out.println("Август");
                    break;
                case  9:
                    System.out.println("Сентябрь");
                    break;
                case  10:
                    System.out.println("Октябрь");
                    break;
                case  11:
                    System.out.println("Ноябрь");
                    break;
                case  12:
                    System.out.println("Декабрь");
                    break;
            }
        } else {
            System.out.println("Не допустимое значение!");
            main(args);
        }
    }
    public static boolean isNumberEmpty (String s) {
        return s.matches("[1-9]|1[0-2]");
    }
}

