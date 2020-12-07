package epam.fundamentals.task1;

/*
 *   Найти количество чисел, содержащих только четные цифры,
 *   а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 */

import java.util.Arrays;

public class App5 {
    public static void evenNumbers(int[] numbers) {
        System.out.println("\n*Найти количество чисел, содержащих только четные цифры,\n" +
                "а среди оставшихся — количество чисел с равным числом четных и нечетных цифр*");
        int[] evenOnly = new int[numbers.length]; // массив только четных цифр
        int indexEventOnly = 0; // его текущая позиция
        int[] equaly = new int[numbers.length]; // массив чисел с равным числом четных и нечетных цифр
        int indexEqualy = 0; // его текушая позиция
        // бежим по всем часлам
        for (int i = 0; i < numbers.length; i++) {
            char[] chars = Integer.toString(numbers[i]).toCharArray();
            int evenQuanity = 0; // количество четных цифр
            int equalyQuanity = 0; // количество нечетных цифр
            for (int j = 0; j < chars.length; j++) {
                int number = Integer.parseInt(String.valueOf(chars[j]));
                if (number % 2 == 0) {
                    evenQuanity++;
                } else {
                    equalyQuanity++;
                }
            }
            // если количество четных цифр = длине числа, то записываем это число в массив четных цифр
            if (evenQuanity == chars.length) {
                evenOnly[indexEventOnly] = numbers[i];
                indexEventOnly++;
            } else { // или проверяем на количество четных и нечетных цифр
                if (evenQuanity == equalyQuanity) {
                    equaly[indexEqualy] = numbers[i];
                    indexEqualy++;
                }
            }
        }
        if (indexEventOnly != 0) {
            evenOnly = Arrays.copyOf(evenOnly, indexEventOnly);
            System.out.println("Количество чисел с чётными цифрами = " + indexEventOnly
                    + "\n" + Arrays.toString(evenOnly));
        } else {
            System.out.println("Чисел с чётными цифрами нет");
        }
        if (indexEqualy != 0) {
            equaly = Arrays.copyOf(equaly, indexEqualy);
            System.out.println("Количество чисел с равным числом четных и нечетных цифр = " + indexEqualy
                    + "\n" + Arrays.toString(equaly));
        } else {
            System.out.println("Чисел с равным числом четных и нечетных цифр нет");
        }
    }
}