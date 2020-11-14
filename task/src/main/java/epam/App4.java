package epam;

/*
 * 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и
 *    вывести результат на консоль.
 */

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        int [] masInt = new int[args.length]; // Массив чисел (аргументов)
        // Если все числа валидны
        if (checkArrayToInt(args, masInt)) {
            int sum = 0; // сумма чисел
            int pr = 1; // произведение чисел
            boolean flagSum = true;
            boolean flagPr = true;
            // цикл для подсчета суммы и произведения чисел (аргументов)
            for (int k: masInt) {
                if (checkSum(sum, k)) {
                    sum += k;
                } else {
                    System.out.println("Превышено максимальное или минимальное значение для вычисления суммы и произведения чисел");
                    flagSum = flagPr = false;
                    break;
                }
                if (checkPr(pr, k)) {
                    pr *= k;
                } else {
                    System.out.println("Превышено максимальное или минимальное значение для вычисления произведения чисел");
                    flagPr = false;
                    break;
                }
            }
            System.out.println(flagSum ? ("Сумма чисел = " + sum) : ("Сумму чисел не вычислить"));
            System.out.println(flagPr ? ("Произведение чисел = " + pr) : ("Произведение чисел не вычислить"));

        } else {
            // Если метод запущен без аргументов, то предлагается ввести эти аргументы
            System.out.println("Введите целые числа через пробел и нажмите Enter");
            Scanner scanner = new Scanner(System.in);
            String inText = scanner.nextLine();
            String [] arrStr = inText.split("\\s+");
            main(arrStr);
        }
    }

    // Проверка на пределы значения int при сложении 2-х чисел
    public static boolean checkSum (int valueOne, int valueTwo) {
        long s = (long) valueOne + (long) valueTwo;
        return  (s > Integer.MIN_VALUE && s < Integer.MAX_VALUE);
    }

        // Проверка на пределы значения int при умножении 2-х чисел
    public static boolean checkPr (int valueOne, int valueTwo) {
        long s = (long) valueOne * (long) valueTwo;
        return  (s > Integer.MIN_VALUE && s < Integer.MAX_VALUE);
    }

        // Проверка на пустой массив
    public static boolean isArrayEmpty (String [] array) {
        boolean flag;
        if (flag = (array != null && array.length != 0)) {
            int hash = 0;
            for (String s: array) {
                hash += s.hashCode();
            }
            flag = (hash != 0);
        } return flag;
    }

    // Проверка массива на валидность данных (целые числа типа int)
    public static boolean checkArrayToInt (String [] arrayStr, int [] arrayInt) {
        boolean flag;
        if (flag = isArrayEmpty(arrayStr)) {
            for (int i = 0; i < arrayStr.length; i++) {
                if (flag = arrayStr[i].matches("^-?[0-9]{1,10}")) {
                    if ( flag = (Long.parseLong(arrayStr[i]) < Integer.MAX_VALUE && Long.parseLong(arrayStr[i]) > Integer.MIN_VALUE) ) {
                        arrayInt[i] = Integer.parseInt(arrayStr[i]);
                        }
                }
            }
        } return flag;
    }

}
