package epam;

/*
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и
 *    вывести результат на консоль.
 */

import java.util.Arrays;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        try {
            // Если введены аргументы метода main
            if (args.length != 0) {
                int addition = 0; // сумма чисел
                int composition = 1; // произведение чисел
                // цикл для подсчета суммы и произведения чисел (аргументов)
                for (String line : args) {
                    addition += Integer.parseInt(line);
                    composition *= Integer.parseInt(line);
                }
                System.out.println("Введены целые числа как аргументы данного метода: \n" +
                                    Arrays.deepToString(args));
                System.out.println("Сумма чисел = " + addition);
                System.out.println("Произведение чисел = " + composition);
            } else {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Метод запущен без аргументов или введено недопустимое значение\n" +
                                "Введите целые числа через пробел и нажмите Enter");
            Scanner scanner = new Scanner(System.in);
            String inText = scanner.nextLine();
            String[] arrStr = inText.split("\\s+");
            main(arrStr);
        }
    }
}