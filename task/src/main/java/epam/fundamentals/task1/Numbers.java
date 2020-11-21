package epam.fundamentals.task1;

/*
 * Создание массива чисел и перевод его в массив в двоичной системе типа String
 */

import java.util.*;

public class Numbers {

    public static int[] readNumbers(Scanner scanner) throws InputMismatchException {
        System.out.println("Введите количество чисел больше 0");
        int quantity = scanner.nextInt();
        if (quantity <= 0) {
            throw new InputMismatchException();
        }
        int[] numbers = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }

    public static String[] toBinaryNumbers(int[] numbers) {
        String[] binaryNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            binaryNumbers[i] = Integer.toBinaryString(numbers[i]);
        }
        return binaryNumbers;
    }

    public static void printNumbers(int[] numbers) {
        System.out.println("Массив чисел " + Arrays.toString(numbers));
    }

    public static void printNumbers(String[] numbers) {
        System.out.println("Массив чисел в двоичной системе " + Arrays.deepToString(numbers));
    }
}
