package epam.fundamentals.task1;

/*
 * Найти число, в котором количество различных цифр минимально.
 * Если таких чисел несколько, найти первое из них.
 */

import java.util.Arrays;

public class App4 {
    public static void minRepNumber(int[] numbers) {
        System.out.println("\n*Найти число, в котором количество различных цифр минимально.\n" +
                "Если таких чисел несколько, найти первое из них.*");
        /* Создадим двумерный массив, в котором первый элемент будет отображать само число,
           а второй - количество различных цифр в числе*/
        int[][] repNumber = new int[numbers.length][2];
        // изначально думаем, что первое число имеет минимальное количество различных цифр
        int minNumber = Integer.toString(numbers[0]).length();
        int PositionMinDiffQuanity = 0;
        // бежим по всем числам
        for (int i = 0; i < numbers.length; i++) {
            // каждое число представляем как массив символов
            char[] chars = Integer.toString(numbers[i]).toCharArray();
            int diffQuanity = 0;// количество различных цифр в числе
            // бежим по массиву символов каждого числа
            for (int j = 0; j < chars.length; j++) {
                boolean flag = true;
                for (int k = j - 1; k >= 0; k--) { // бежим назад от текущей позиции и сравниваем
                    if (chars[k] == chars[j]) { // если такой символ уже был
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    diffQuanity++; // если такого символа не было, то количество инкрементируем
                }
            }
            repNumber[i][0] = numbers[i];
            repNumber[i][1] = diffQuanity;
            // если это число имеет меньшее количество цифр, чем у предыдущего, то оно будет минимальным
            if (diffQuanity < minNumber) {
                minNumber = diffQuanity;
                PositionMinDiffQuanity = i;
            }
        }
        System.out.println("Первое число, которое имеет минимальное кольчество различных элементов = " +
                numbers[PositionMinDiffQuanity]);
        System.out.println("Отобразим все числа в формате: [число, количество различных элементов]\n" + Arrays.deepToString(repNumber));
    }
}
