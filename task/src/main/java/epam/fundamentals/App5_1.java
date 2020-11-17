package epam.fundamentals;

import java.util.Scanner;

/*
 * 5.   Ввести число от 1 до 12.
 * Вывести на консоль название месяца, соответствующего данному числу.
 * Осуществить проверку корректности ввода чисел.
 */

public class App5_1 {
    public static void main(String[] args) {
        int monthNumber;
        System.out.println("Введите число от 1 до 12");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        try {
            monthNumber = Integer.parseInt(month);
            if (monthNumber > 0 && monthNumber <= 12) {
                for (Month month1 : Month.values()) {
                    if (month1.getNumber() == monthNumber) {
                        System.out.println(month1.getTitle());
                        break;
                    }
                }
            } else {
                System.err.println("Не правильный ввод числа");
            }
            ;
        } catch (NumberFormatException e) {
            System.err.println("Не допустимое значение! " + e);
        }
    }
}

enum Month {
    JANUARY(1, "Январь"),
    FEBRUARY(2, "Ферраль"),
    MARCH(3, "Март"),
    APRIL(4, "Апрель"),
    MAY(5, "Май"),
    JUNE(6, "Июнь"),
    JULY(7, "Июль"),
    AUGUST(8, "Август"),
    SEPTEMBER(9, "Сентябрь"),
    OCTOBER(10, "Октябрь"),
    NOVENBER(11, "Ноябрь"),
    DECEMBER(12, "Декабрь");

    private int number;
    private String title;

    private Month(int number, String title) {
        this.number = number;
        this.title = title;
    }

    public int getNumber() {
        return this.number;
    }

    public String getTitle() {
        return this.title;
    }
}