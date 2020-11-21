package epam.fundamentals.task1;

/*
 *  Задание. Ввести n чисел с консоли.
 *  1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

import java.util.*;

public class App1 {
    public static void main(String[] args) {
        int[] numbers = new int[0]; // так можно делать? Не хочу весь код помещать в блок try
        try {
            numbers = Numbers.readNumbers(new Scanner(System.in));
        } catch (InputMismatchException e) {
            System.err.println("Введено не допустимое значение " + e);
            System.exit(1);
        }
        String[] binaryNumbers = Numbers.toBinaryNumbers(numbers);
        Numbers.printNumbers(numbers);
        Numbers.printNumbers(binaryNumbers);
        int min = 0;
        int max = 0;
        for (int i = 1; i < binaryNumbers.length; i++) {
            if (binaryNumbers[i].length() < binaryNumbers[min].length()) {
                min = i;
            }
            if (binaryNumbers[i].length() > binaryNumbers[max].length()) {
                max = i;
            }
        }
        System.out.println("Самое длинное число " + numbers[max] + " {" + binaryNumbers[max] + "}\n" +
                "его длина = " + binaryNumbers[max].length());
        System.out.println("Самое короткое число " + numbers[min] + " {" + binaryNumbers[min] + "}\n" +
                "его длина = " + binaryNumbers[min].length());
    }
}

