package epam.fundamentals.task1;

/*
 *  Задание. Ввести n чисел с консоли.
 *  1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 *
 *  2.     Вывести числа в порядке возрастания (убывания) значений их длины.
 *
 *  3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам,
 *         а также длину.
 *
 *  4.     Найти число, в котором количество различных цифр минимально.
 *         Если таких чисел несколько, найти первое из них.
 *
 *  5.     Найти количество чисел, содержащих только четные цифры,
 *         а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 *
 *  6.     Найти число, цифры в котором идут в строгом порядке возрастания.
 *         Если таких чисел несколько, найти первое из них.
 *
 *  7.     Найти число, состоящее только из различных цифр.
 *         Если таких чисел несколько, найти первое из них.
 */

import java.util.*;

public class App {
    public static void main(String[] args) {
        Numbers number = new Numbers(new Scanner(System.in));
        int[] numbers = null;
        try {
            numbers = number.readNumbers();
        } catch (InputMismatchException e) {
            System.err.println("Введено не допустимое значение " + e);
            System.exit(1);
        }
        String[] binaryNumbers = number.toBinaryNumbers(numbers);
        number.printNumbers(numbers);
        number.printNumbers(binaryNumbers);
        // Задание 1
        App1.minMaxValueNumbers(numbers, binaryNumbers);
        // Задание 2
        App2.sortValueNumbers(numbers, binaryNumbers);
        // Задание 3
        App3.sortLeingth(numbers, binaryNumbers);
        // Задание 4
        App4.minRepNumber(numbers);
        // Задание 5
        App5.evenNumbers(numbers);
        // Задание 6
        App6.increaseNumber(numbers);
        // Задание 7
        App7.different(numbers);
    }
}

