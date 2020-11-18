package epam.fundamentals.task1;

import java.util.Scanner;

public class NumbersReader {
    private Scanner scanner;

    public NumbersReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[] readNumbers() {
        int quantity = scanner.nextInt();
        int[] numbers = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            numbers[i] = (int) (Math.random() * 100);
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
}
