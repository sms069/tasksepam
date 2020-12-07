package epam.fundamentals.task1;

/*
 *    Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам,
 *    а также длину.
 */

public class App3 {
    public static void sortLeingth (int[] numbers, String[] binaryNumbers) {
        System.out.println("\n*Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину*");
        int averageLength = 0;
        for (String binNum : binaryNumbers) {
            averageLength += binNum.length();
        }
        averageLength /= binaryNumbers.length;
        System.out.println("Средняя длина чисел = " + averageLength);
        StringBuilder less = new StringBuilder();
        StringBuilder more = new StringBuilder();
        for (int i = 0; i < binaryNumbers.length; i++) {
            if (binaryNumbers[i].length() < averageLength) {
                less.append(numbers[i] + "{" + binaryNumbers[i] + "}(" + binaryNumbers[i].length() + ") ");
            }
            if (binaryNumbers[i].length() > averageLength) {
                more.append(numbers[i] + "{" + binaryNumbers[i] + "}(" + binaryNumbers[i].length() + ") ");
            }
        }
        System.out.println("Числа, длина которых меньше средней длины по всем числам\n" + less.toString());
        System.out.println("Числа, длина которых больше средней длины по всем числам\n" + more.toString());
    }
}
