package epam.fundamentals.task1;

/*
 * Создание массива чисел и перевод его в массив в двоичной системе типа String
 */

import java.util.*;

public class Numbers {

    private Scanner scanner;

    public Numbers(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[] readNumbers() throws InputMismatchException {
        System.out.println("Введите количество чисел больше 1");
        int quantity = scanner.nextInt();
        if (quantity <= 1) {
            throw new InputMismatchException();
        }
        int[] numbers = new int[quantity];
        // здесь можно закоментировать автоматический рандомный или ручной ввод чисел
        for (int i = 0; i < quantity; i++) {
            numbers[i] = (int) (Math.random() * 10 * (Math.random() * 10 > 4 ? 1000 : 10));
//            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public String[] toBinaryNumbers(int[] numbers) {
        String[] binaryNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            binaryNumbers[i] = Integer.toBinaryString(numbers[i]);
        }
        return binaryNumbers;
    }

    public void printNumbers(int[] numbers) {

        System.out.println("Массив чисел " + Arrays.toString(numbers));
    }

    public void printNumbers(String[] numbers) {
        System.out.println("Массив чисел в двоичной системе " + Arrays.deepToString(numbers));
    }
}
