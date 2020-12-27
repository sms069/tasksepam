package epam.fundamentals.task2;

import java.lang.*;

/*
 * Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 */

public class App4 {

    private static int indexLineMaxElem;
    private static int indexColumnMaxElem;

    public static int[][] removeMax(int[][] numbers) {
        System.out.println("\n*Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие*");
        int maxElem = searchMaxElem(numbers);
        System.out.println("Максимальный элемент матрицы = " + maxElem);
        printNumberColorElem(numbers, maxElem);
        System.out.println("Удалим из матрицы все строки и столбцы, его содержащие");
        while (maxElem == searchMaxElem(numbers)) {
            numbers = removeLineColumn(numbers);
            if (numbers == null) {
                break;
            }
        }
        return numbers;
    }

    private static int searchMaxElem(int[][] numbers) {
        int maxElem = numbers[0][0];
        // поиск максимального элемента
        for (int line = 0; line < numbers.length; line++) {
            for (int column = 0; column < numbers[0].length; column++) {
                if (numbers[line][column] > maxElem) {
                    maxElem = numbers[line][column];
                    indexLineMaxElem = line;
                    indexColumnMaxElem = column;
                }
            }
        }
        return maxElem;
    }

    private static int[][] removeLineColumn(int[][] numbers) {
        if (numbers == null) {
            return null;
        }
        if (numbers.length <= 1 || numbers[0].length <= 1){
            return null;
        }
        int[][] tmpArr = new int[numbers.length - 1][numbers[0].length - 1];
        for (int line = 0; line < numbers.length - 1; line++) {
            for (int column = 0; column < numbers[0].length - 1; column++) {
                if (line >= indexLineMaxElem) {
                    if (column >= indexColumnMaxElem) {
                        tmpArr[line][column] = numbers[line + 1][column + 1];
                    } else {
                        tmpArr[line][column] = numbers[line + 1][column];
                    }
                } else {
                    if (column >= indexColumnMaxElem) {
                        tmpArr[line][column] = numbers[line][column + 1];
                    } else {
                        tmpArr[line][column] = numbers[line][column];
                    }
                }
            }
        }
        return tmpArr;
    }

    public static void printNumberColorElem(int[][] numbers, int elem){
        for (int[] number : numbers) {
            for (int i = 0; i < number.length; i++) {
                if (number[i] == elem) {
                    System.out.print("\033[31;1m" + number[i] + "\033[0m" + " ");
                } else {
                    System.out.print(number[i] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
