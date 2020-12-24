package epam.fundamentals.task1;

/*
 *      Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */

import java.util.Arrays;

public class App7 {

    public static void different(int[] numbers) {
        System.out.println("\n*Найти число, состоящее только из различных цифр. " +
                "Если таких чисел несколько, найти первое из них*");
        int[] diffNumber = new int[numbers.length];
        int indexDiff = 0;
        for (int i = 0; i < numbers.length; i++) {
            char[] chars = Integer.toString(numbers[i]).toCharArray();
            boolean flag = true;
            if (chars.length > 1) {
                for (int j = 0; j < chars.length - 1; j++) {
                    for (int k = j + 1; k < chars.length; k++) {
                        if (chars[j] == chars[k]) {
                            flag = false;
                        }
                    }
                }
            } else {
                flag = false;
            }
            if (flag) {
                diffNumber[indexDiff] = numbers[i];
                indexDiff++;
            }
        }
        if (indexDiff > 0) {
            diffNumber = Arrays.copyOf(diffNumber, indexDiff);
            System.out.println("Первое число, состоящее только из различных цифр = " + diffNumber[0] + "\n" +
                    Arrays.toString(diffNumber));
        } else {
            System.out.println("Чисел, состоящих только из различных цифр нет");
        }
    }
}
