package epam.fundamentals.task2;

/*
 *    Задание. Ввести с консоли n - размерность матрицы a [n] [n].
 *    Задать значения элементов матрицы в интервале значений от -M до M
 *    с помощью генератора случайных чисел (класс Random).
 *
 * 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 *
 * 2. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 *
 * 3. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки
 *
 * 4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие
 */

import java.util.*;

public class App {

    public static void main(String[] args) {
        Numbers number = new Numbers(new Scanner(System.in));
        int[][] numbers = null;
        try {
            numbers = number.readNumbers();
        } catch (InputMismatchException e) {
            System.err.println("Не верный ввод " + e);
            System.exit(1);
        }
        Numbers.printNumbers(numbers);
        // Задание 1
//        App1.sortRandomNumbers(numbers);
        // Задание 2
//        App2.findSortElem(numbers);
        // Задание 3
//        App3.summElem(numbers);
        // Задание 4
        numbers = App4.removeMax(numbers);
        Numbers.printNumbers(numbers);
    }

}
