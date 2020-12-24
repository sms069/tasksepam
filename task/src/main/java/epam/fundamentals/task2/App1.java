package epam.fundamentals.task2;

/*
 * Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки)
 */

import java.util.Random;

public class App1 {

    public static void sortRandomNumbers(int[][] numbers) {
        System.out.println("\n*Упорядочить строки (столбцы) матрицы в порядке" +
                " возрастания значений элементов k-го столбца (строки)*");
        Random random = new Random();
        int sortRandom = random.nextInt(40) - 20;
        int sort;
        if (sortRandom % 2 == 0) { // если случайное число чётное, то сортируем столбец
            sort = random.nextInt(numbers[0].length); // № случайного столбца
            sortColumn(numbers, sort, sortRandom > 0); // сортируем столбец
            // печатаем массив, выделив цветом отсортированый столбец
            printNumbersColor(numbers, -1, sort);
        } else { // если случайное число не четное, то сортируем строку
            sort = random.nextInt(numbers.length); // № случайной строки
            sortLine(numbers, sort, sortRandom > 0); // сортируем строку
            // печатаем массив, выделив цветом отсортированую строку
            printNumbersColor(numbers, sort, -1);
        }
    }

    // сортировка строки
    private static void sortLine(int[][] numbers, int sort, boolean flag) {
        // sort - номер строки, которую будем сортировать
        // flag - сортируем по возрастанию или по убыванию
        System.out.println((sort + 1) + "-я строка матрицы отсортирована по " +
                (flag ? "возрастанию" : "убыванию"));
        for (int i = 0; i < numbers[0].length - 1; i++) {
            for (int j = i + 1; j < numbers[0].length; j++) {
                if (flag) { // сортируем по возрастанию
                    if (numbers[sort][j] < numbers[sort][i]) {
                        int tmp = numbers[sort][i];
                        numbers[sort][i] = numbers[sort][j];
                        numbers[sort][j] = tmp;
                    }
                } else { // сортируем по убыванию
                    if (numbers[sort][j] > numbers[sort][i]) {
                        int tmp = numbers[sort][i];
                        numbers[sort][i] = numbers[sort][j];
                        numbers[sort][j] = tmp;
                    }
                }
            }
        }
    }

    // Сортировка столбца
    private static void sortColumn(int[][] numbers, int sort, boolean flag) {
        // sort - номер строки, которую будем сортировать
        // flag - сортируем по возрастанию или по убыванию
        System.out.println((sort + 1) + "-й столбец матрицы отсортирован по " +
                (flag ? "возрастанию" : "убыванию"));
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (flag) { // сортируем по возрастанию
                    if (numbers[j][sort] < numbers[i][sort]) {
                        int tmp = numbers[i][sort];
                        numbers[i][sort] = numbers[j][sort];
                        numbers[j][sort] = tmp;
                    }
                } else { // сортируем по убыванию
                    if (numbers[j][sort] > numbers[i][sort]) {
                        int tmp = numbers[i][sort];
                        numbers[i][sort] = numbers[j][sort];
                        numbers[j][sort] = tmp;
                    }
                }
            }
        }
    }

    // Печать массива с возможностью выделения цветом строки и столбца
    public static void printNumbersColor(int[][] numbers, int lineColor, int columnColor) {
        /* line - номер строки, которую нужно выделить цветом
         *  column - номер столбца, который надо выделить цветом
         *  Если не нужно печатать цветом, то в качестве аргументов в метод необходимо
         *  передать числа, которые точно не соответствует индексу массива.
         *  Это отрицательное число, например -1
         */
        for (int line = 0; line < numbers.length; line++) {
            for (int column = 0; column < numbers[0].length; column++) {
                if (line == lineColor || column == columnColor) {
                    System.out.print("\033[31;1m" + numbers[line][column] + "\033[0m" + " ");
                } else {
                    System.out.print(numbers[line][column] + " ");
                }
            }
            System.out.println();
        }
    }

}
