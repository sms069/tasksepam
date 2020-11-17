package epam.fundamentals;

/*
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и
 *    вывести результат на консоль.
 */

import java.util.Arrays;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        // Если введены аргументы метода main
        if (args.length != 0) {
            int addition = 0; // сумма чисел
            int composition = 1; // произведение чисел
            // цикл для подсчета суммы и произведения чисел (аргументов)
            try {
                for (String line : args) {
                    addition += Integer.parseInt(line);
                    composition *= Integer.parseInt(line);
                }

                System.out.println("Введены целые числа как аргументы данного метода: \n" +
                        Arrays.deepToString(args));
                System.out.println("Сумма чисел = " + addition);
                System.out.println("Произведение чисел = " + composition);
            } catch (NumberFormatException e) {
                System.err.println("Не допустимое значение! " + e);
            }
        } else {
            System.err.println("Метод запущен без аргументов");
        }
    }
}