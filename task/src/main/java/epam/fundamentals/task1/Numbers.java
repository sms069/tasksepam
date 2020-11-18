package epam.fundamentals.task1;

/*
 * Создание массива чисел
 */

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    private int[] numbers;
    private String[] binaryNumbers;

    public Numbers() {
        NumbersReader numbersReader = new NumbersReader(new Scanner(System.in));
        this.numbers = numbersReader.readNumbers();
        this.binaryNumbers = numbersReader.toBinaryNumbers(numbers);
        printNumbers();
    }

    public int[] getNumbers() {
        return this.numbers;
    }

    public String[] getBinaryNumbers() {
        return this.binaryNumbers;
    }

    public void printNumbers() {
        System.out.println(Arrays.toString(this.numbers));
        System.out.println("Эти числа в двоичной системе исчисления \n" +
                Arrays.deepToString(this.binaryNumbers));
    }
}
