package epam.fundamentals.task1;

/*
 *  Задание. Ввести n чисел с консоли.
 *  1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 */

public class App1 {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        int min = 0;
        int max = 0;
        for (int i = 1; i < numbers.getBinaryNumbers().length; i++) {
            if (numbers.getBinaryNumbers()[i].length() < numbers.getBinaryNumbers()[min].length()) {
                min = i;
            }
            if (numbers.getBinaryNumbers()[i].length() > numbers.getBinaryNumbers()[max].length()) {
                max = i;
            }
        }
        System.out.println("Самое длинное число " + numbers.getNumbers()[max] + " {" + numbers.getBinaryNumbers()[max] + "}\n" +
                "его длина = " + numbers.getBinaryNumbers()[max].length());
        System.out.println("Самое короткое число " + numbers.getNumbers()[min] + " {" + numbers.getBinaryNumbers()[min] + "}\n" +
                "его длина = " + numbers.getBinaryNumbers()[min].length());
    }
}

