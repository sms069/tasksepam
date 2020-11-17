package epam.fundamentals;

/*
 *  3.   Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */
public class App3 {
    public static void main(String[] args) {
        int quanity = 10; // Количество случайных чисел
        int[] array = new int[quanity];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            if (i != 0) { // Выводим числа больше 5 с новой строки
                System.out.print((array[i] > 5 ? (array[i] == 0 ? "" : "\n") : " ") + array[i]);
            } else { // Выводим первое число
                System.out.print(array[i]);
            }
        }

    }
}
