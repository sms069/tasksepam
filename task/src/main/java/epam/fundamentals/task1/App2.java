package epam.fundamentals.task1;

// Вывести числа в порядке возрастания (убывания) значений их длины.

import java.util.*;

public class App2 {

    public static void sortValueNumbers(int[] numbers, String[] binaryNumbers) {
        System.out.println("\n*Вывести числа в порядке возрастания (убывания) значений их длины*");
        // создается массив индексов значений длины чисел
        int[] index = new int[numbers.length];
        // создаётся близнец массива бинарных значений чисел, который будем сортировать
        String[] sortBinaryNumbers = new String[numbers.length];
        // заполняется массив индексов и близнец массива бинарных значений чисел
        for (int i = 0; i < index.length; i++) {
            index[i] = i;
            sortBinaryNumbers[i] = binaryNumbers[i];
        }
        // сортировка вставками
        for (int i = 1; i < sortBinaryNumbers.length; i++) {
            int min = i - 1;
            String current = sortBinaryNumbers[i];
            int currSort = index[i];
            while (min >= 0 && current.length() < sortBinaryNumbers[min].length()) {
                sortBinaryNumbers[min + 1] = sortBinaryNumbers[min];
                index[min + 1] = index[min];
                min--;
            }
            sortBinaryNumbers[min + 1] = current;
            index[min + 1] = currSort;
        }
        StringBuilder toUp = new StringBuilder("[");//строка вывода значений по возрастанию
        StringBuilder toDown = new StringBuilder("[");//строка вывода значений по убыванию
        //цикл для заполнения вывода значений
        for (int i = 0; i < numbers.length; i++) {
            toUp.append(numbers[index[i]] + "{" + binaryNumbers[index[i]] + "}, ");
            toDown.append(numbers[index[numbers.length - 1 - i]] + "{" + binaryNumbers[index[numbers.length - 1 - i]] + "}, ");
            if (i + 1 == numbers.length) {
                toUp.delete(toUp.length() - 2, toUp.length());
                toUp.append("]");
                toDown.delete(toDown.length() - 2, toDown.length());
                toDown.append("]");
            }
        }
        System.out.println("Числа в порядке возрастания значений их длины\n" + toUp +
                "\nЧисла в порядке убывания значений их длины\n" + toDown);
    }
}
