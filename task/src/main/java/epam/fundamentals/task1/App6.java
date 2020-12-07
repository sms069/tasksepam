package epam.fundamentals.task1;

/*
 *      Найти число, цифры в котором идут в строгом порядке возрастания.
 *      Если таких чисел несколько, найти первое из них.
 */

import java.util.Arrays;

public class App6 {

    public static void increaseNumber(int[] numbers) {
        System.out.println("\n*Найти число, цифры в котором идут в строгом порядке возрастания." +
                "Если таких чисел несколько, найти первое из них*");
        int[] increase = new int[numbers.length];
        int indexIncrease = 0;
        for (int i = 0; i < numbers.length; i++) {
            char[] chars = Integer.toString(numbers[i]).toCharArray();
            boolean flag = true;
            if (chars.length > 1) {
                for (int j = 0; j < chars.length - 1; j++) {
                    int number = Integer.parseInt(String.valueOf(chars[j]));
                    int numberNext = Integer.parseInt(String.valueOf(chars[j + 1]));
                    if (numberNext != number + 1) {
                        flag = false;
                        break;
                    }
                }
            } else {
                flag = false;
            }
            if (flag) {
                increase[indexIncrease] = numbers[i];
                indexIncrease++;
            }
        }
        if (indexIncrease != 0) {
            increase = Arrays.copyOf(increase, indexIncrease);
            System.out.println("Чисел, цифры в которых идут в строгом порядке возрастания = " + indexIncrease +
                    "\nПервое из них = " + increase[0] + "\n" + Arrays.toString(increase));

        } else {
            System.out.println("Чисел, цифры в которых идут в строгом порядке возрастания нет");
        }
    }
}
