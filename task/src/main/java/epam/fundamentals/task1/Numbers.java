package epam.fundamentals.task1;

/*
 * Создание массива чисел
 */

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
    private int [] numbers;
    private String [] binaryNumbers;

    public Numbers(){
        setNumbers();
        System.out.println(Arrays.toString(getNumbers()));
        setBeenaryNumbers();
        System.out.println("Эти числа в двоичной системе исчисления \n" +
                Arrays.deepToString(getBinaryNumbers()));
    }

    public int[] getNumbers() {
        return this.numbers;
    }

    public String[] getBinaryNumbers() {
        return this.binaryNumbers;
    }

    public void setBeenaryNumbers() {
        String binaryNumbers [] = new String[this.numbers.length];
        for (int i = 0; i < this.numbers.length; i++) {
            binaryNumbers[i] = Integer.toBinaryString(this.numbers[i]);
        }
        this.binaryNumbers = binaryNumbers;
    }

    public void setNumbers() {
        Scanner scanner = new Scanner(System.in);
        int nunber = 0;
        try {
            nunber = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.err.println("Не верный ввод " + e);
            System.exit(0);
        }
        int [] numbers = new int[nunber];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        this.numbers = numbers;
    }
}
