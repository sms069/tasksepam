package epam.fundamentals.task1;

// Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class App1 {

    public static void minMaxValueNumbers(int [] numbers, String [] binaryNumbers) {
        System.out.println("\n*Найти самое короткое и самое длинное число. Вывести найденные числа и их длину*");
        int min = 0;
        int max = 0;
        for (int i = 1; i < binaryNumbers.length; i++) {
            if (binaryNumbers[i].length() < binaryNumbers[min].length()) {
                min = i;
            } else {
                if (binaryNumbers[i].length() > binaryNumbers[max].length()) {
                    max = i;
                }
            }
        }
        System.out.println("Самое длинное число = " + numbers[max] + " {" + binaryNumbers[max] + "}\n" +
                "его длина = " + binaryNumbers[max].length());
        System.out.println("Самое короткое число = " + numbers[min] + " {" + binaryNumbers[min] + "}\n" +
                "его длина = " + binaryNumbers[min].length());
    }
}