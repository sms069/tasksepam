package epam;

/*
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и
 *    вывести результат на консоль.
 */

import java.util.Arrays;
import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        // Если метод запущен без аргументов, то предлагается ввести эти аргументы
        if (isArrayEmpty(args)) {
            // Обработка аргументов метода
            System.out.println("Длинна массива " + args.length + " Хэш код " + args[0].hashCode());
            System.out.println("Метод запущен с аргументами" + Arrays.deepToString(args));
            System.out.print("Из них числами являются: ");
            int [] masInt = new int[args.length]; // Массив чисел (аргументов)
            for (int i = 0; i < args.length; i++) {
                if (args[i].matches("^-?[0-9]+")) { // Если аргумент содержит только целое число
                    try {
                        masInt[i] = Integer.parseInt(args[i]); // преобразование строки в число
                        System.out.print(masInt[i] + " ");
                    } catch (NumberFormatException e) {
                        System.out.println("Введено слишком большое число");
                        args = new String[0];
                        System.out.println(Arrays.deepToString(args));;
                        main(args);
                    }
                }
            }

            int sum = 0; // сумма чисел
            int pr = 1; // произведение чисел

            // цикл для подсчета суммы и произведения чисел (аргументов)
            boolean flagSum = true;
            boolean flagPr = true;
            for (int k: masInt) {
                if (checkSum(sum, k)) {
                    sum += k;
                } else  {
                    System.out.println("\nПревышено максимальное или минимальное значение для вычисления суммы и произведения чисел");
                    flagSum = flagPr = false;
                    break;
                }
//                if ((Integer.MAX_VALUE / k >= sum) && (Integer.MIN_VALUE / k <= sum)) {
                if (checkPr(pr, k)) {
                    pr *= k;
                } else  {
                    System.out.println("\nПревышено максимальное или минимальное значение для вычисления произведения чисел");
                    flagPr = false;
                    break;
                }
            }
            System.out.println(flagSum ? ("\nСумма этих чисел = " + sum) : ("Сумму чисел не вычислить"));
            System.out.println(flagPr ? ("Произведение всех чисел = " + pr) : ("Произведение чисел не вычислить"));
            System.exit(0); // Если я этого не напишу, то программа завершается не адекватно
        } else {
            System.out.println("Введите целые числа через пробел и нажмите Enter");
            Scanner scanner = new Scanner(System.in);
            String inText = scanner.nextLine();
            String [] arrStr = inText.split("\\s+");
            main(arrStr);
        }
    }

    public static boolean checkSum (int valueOne, int valueTwo) {
        long s = (long) valueOne + (long) valueTwo;
        if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
            return false;
        } else return true;
    }

    public static boolean checkPr (int valueOne, int valueTwo) {
        long s = (long) valueOne * (long) valueTwo;
        if (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE) {
            return false;
        } else return true;
    }
        // Проверка на пустой массив
    public static boolean isArrayEmpty (String [] array) {
        if (array == null || array.length == 0) {
            return false;
        } else {
            int hash = 0;
            for (String s: array) {
                hash += s.hashCode();
            }
            if (hash == 0) {
                return false;
            } else  return true;
        }
    }
}
