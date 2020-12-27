package epam.fundamentals.task2;

import java.util.*;

public class Numbers {
    private Scanner scanner;

    public Numbers(Scanner scanner) {
        this.scanner = scanner;
    }

    public int[][] readNumbers() throws InputMismatchException {
        System.out.println("Введите размерность двухмерной матрицы[][]. Значения больше 0");
        int line = scanner.nextInt(); // количество строк
        int column = scanner.nextInt(); // количество столбцов
        if (line <= 0 || column <= 0) {
            throw new InputMismatchException();
        }
        int[][] numbers = new int[line][column];
        System.out.println("Задайте значения элементов матрицы в интервале от ... и до ...");
        int min = scanner.nextInt();
        int max = scanner.nextInt();
        if (min >= max) {
            throw new InputMismatchException();
        }
        int diff = max - min;
        Random random = new Random();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j] = min + random.nextInt(diff);
            }
        }
        return numbers;
    }

    // Печать массива
    public static void printNumbers(int[][] numbers) {
        if (numbers == null) {
            System.out.println("Пустой массив!!!");
        } else {
            for (int[] number : numbers) {
                for (int j = 0; j < numbers[0].length; j++) {
                    System.out.print(number[j] + " ");
                }
                System.out.println();
            }
        }
    }

}
